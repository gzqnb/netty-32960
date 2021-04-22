package com.nevt.gbt32960.protocol;

import com.alibaba.fastjson.JSON;
import com.nevt.gbt32960.common.dto.Envelope;
import com.nevt.gbt32960.common.factory.ThreadFactoryCustomer;
import com.nevt.gbt32960.common.http.HTTPTask;
import com.nevt.gbt32960.formatters.DataUnitToDTO;
import com.nevt.gbt32960.formatters.FormatterToDataUnit;
import com.nevt.gbt32960.message.LoginRequest;
import com.nevt.gbt32960.message.LogoutRequest;
import com.nevt.gbt32960.message.RealTimeReport;
import com.nevt.gbt32960.modle.DataUnit;
import com.nevt.gbt32960.service.PlatformService;
import com.nevt.gbt32960.service.RedisService;
import com.nevt.gbt32960.paltform.LoginPlatform;
import com.nevt.gbt32960.paltform.PlatformMessage;
import com.nevt.gbt32960.type.FrameHeader;
import com.nevt.gbt32960.type.RequestType;
import com.nevt.gbt32960.type.ResponseTag;
import com.nevt.gbt32960.util.GBT32960Message;
import com.nevt.gbt32960.util.ResponseMessage;
import com.nevt.gbt32960.util.SpringUtil;
import com.nevt.gbt32960.formatters.TimeFormat;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

@Slf4j
@ChannelHandler.Sharable
public class ProtocolHandler extends ChannelDuplexHandler {

    private static final String KEY = "PLATFORM";

    private static final String URL = "http://nevt05:30201/api/input";

    private static final ExecutorService EXECUTOR_SERVICE = ThreadFactoryCustomer.defaultExecutorService();

    @Getter
    private static final ProtocolHandler instance = new ProtocolHandler();

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        response(ctx, msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent e = (IdleStateEvent) evt;
            // 防止读模式
            if (e.state() == IdleState.READER_IDLE) {
                ctx.close();
            }
        }

    }

    private void platformLoginResponse(ChannelHandlerContext context, Object msg) {
        // 获取平台响应登录响应，转换为国标形式数据包
        GBT32960Message message = toGBT32960Message(msg);
        // 获取数据头部信息
        FrameHeader header = message.getHeader();
        log.info("header: ==> " + header);
        // 访问redis查找是否会出现重复vin的情况
        if (redisService().isKey(KEY, header.getVin())) {
            vinRepeat(context, header);
            log.info("VIN Repeat");
        } else {
            // 拿出平台登入的数据单元的用户名和密码结合jpa去寻找postgre上是否有相关数据
            LoginPlatform loginPlatform = (LoginPlatform) message.getDataUnit();

            String username = loginPlatform.getUsername();
            String password = loginPlatform.getPassword();
            // 查询数据库
            boolean one = platformService().findOne(username, password);
            if (one) {
                // 如果查到了
                redisService().add(header.getVin(), loginPlatform.getLoginDaySeq());
                // 刷写回响应，登陆成功，刷写响应至encoderhandler，返回的数据类型为responseMessage作为数据单元
                context.writeAndFlush(responseMessage(header.getVin(), RequestType.PLATFORM_LOGIN, ResponseTag.SUCCESS));

                log.info("Platform login success! login time: ==> "
                        + TimeFormat.longTimeToZoneDateTime(loginPlatform.getLoginTime()));
            } else {
                context.writeAndFlush(responseMessage(header.getVin(), RequestType.PLATFORM_LOGIN, ResponseTag.FAILED));
                log.trace("Platform username or password error!");
            }
        }

    }

    private void vinRepeat(ChannelHandlerContext ctx, FrameHeader header) {
        ctx.writeAndFlush(responseMessage(header.getVin(), RequestType.PLATFORM_LOGIN, ResponseTag.VIN_DUP));
    }

    private GBT32960Message toGBT32960Message(Object msg) {
        if (msg instanceof GBT32960Message) {
            return (GBT32960Message) msg;
        }
        throw new ClassCastException("msg not conversion to GBT32960Message");
    }

    private void response(ChannelHandlerContext context, Object msg) {
        // 服务端是从decoder刷写过来的 客户端是从encoder刷写过来的
        GBT32960Message message = toGBT32960Message(msg);
        // 获取头部信息（不含##）
        FrameHeader header = message.getHeader();
        // 对服务端来说：获取请求类型，根据不同请求类型进行不同的刷写给客户端
        switch (header.getRequestType()) {
            case LOGIN:
                loginResponse(context,msg);
            case LOGOUT:
                logoutResponse(context,msg);
            //如果为补发
            case REISSUE:
                // 进行补发信息处理（同实时数据）
                reIssueResponse(context, msg);
            case REAL_TIME:
                // 进行实时数据处理
                realTimeResponse(context, msg);
                EXECUTOR_SERVICE.execute(() -> {
                    RealTimeReport realTimeReport = (RealTimeReport) message.getDataUnit();
                    DataUnit dataUnit = FormatterToDataUnit.RealTimeReportToDataUnit(realTimeReport, header);
                    log.info("数据获取成功，准备发往快处理" + dataUnit.toString());
                    // todo 发往快处理
                    // 保存至postgre
                    Envelope envelope = dataUnitToDTO().toDTO(dataUnit);
//                send(envelope);
//                    log.info("envelope: ==> " + envelope);
                });
                break;
            case PLATFORM_LOGIN:
                // 平台登入成功后要进行响应
                platformLoginResponse(context, msg);
                break;
            case PLATFORM_LOGOUT:
                // 平台登出后进行响应
                platformLogoutResponse(context, msg);
                break;
//            case PLATFORM_LOGOUT_RESPONSE:
//            case PLATFORM_LOGIN_RESPONSE:
//                log.info(header.getResponseTag().name());
            default:
                log.info("no request type");
                break;
        }
    }

    private void logoutResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        LogoutRequest dataUnit = (LogoutRequest) message.getDataUnit();
        System.out.println(dataUnit.toString());
        String vin = message.getHeader().getVin();
        // TODO 写回客户端进行相应
        context.writeAndFlush(responseMessage(vin, RequestType.LOGOUT, ResponseTag.SUCCESS));
    }

    private void loginResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        LoginRequest dataUnit = (LoginRequest) message.getDataUnit();
        System.out.println(dataUnit.toString());
        String vin = message.getHeader().getVin();
        // TODO 写回客户端进行相应
        context.writeAndFlush(responseMessage(vin, RequestType.LOGIN, ResponseTag.SUCCESS));
    }

    private void realTimeResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        RealTimeReport dataUnit = (RealTimeReport) message.getDataUnit();
        System.out.println(dataUnit.toString());
        String vin = message.getHeader().getVin();
        // TODO 写回客户端进行相应
        context.writeAndFlush(responseMessage(vin, RequestType.REAL_TIME, ResponseTag.SUCCESS));
    }

    private void reIssueResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        RealTimeReport dataUnit = (RealTimeReport) message.getDataUnit();
        System.out.println(dataUnit.toString());
        String vin = message.getHeader().getVin();
        // TODO 写回客户端进行相应
        context.writeAndFlush(responseMessage(vin, RequestType.REISSUE, ResponseTag.SUCCESS));
    }

    private void platformLogoutResponse(ChannelHandlerContext context, Object msg) {
        GBT32960Message message = toGBT32960Message(msg);
        LoginPlatform dataUnit = (LoginPlatform) message.getDataUnit();
        String vin = message.getHeader().getVin();
        if (redisService().isKey(KEY, vin)) {

            boolean delete = redisService().delete(vin, dataUnit.getLoginDaySeq());

            if (delete) {
                log.info("Platform logout success!");
                context.writeAndFlush(responseMessage(vin, RequestType.PLATFORM_LOGOUT, ResponseTag.SUCCESS));
            } else {
                log.info("Platform logout fail! 登入与登出序列化不匹配!");
                context.writeAndFlush(responseMessage(vin, RequestType.PLATFORM_LOGOUT, ResponseTag.FAILED));
            }

        } else {
            System.out.println(responseMessage(vin, RequestType.PLATFORM_LOGOUT, ResponseTag.FAILED).toString());
            context.writeAndFlush(responseMessage(vin, RequestType.PLATFORM_LOGOUT, ResponseTag.FAILED));
            log.info("未登录");
        }
    }

    private ResponseMessage responseMessage(String vin, RequestType requestType, ResponseTag responseTag) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setVin(vin);
        PlatformMessage platformMessage = new PlatformMessage();
        platformMessage.setRequestType(requestType);
        platformMessage.setResponseTag(responseTag);
        platformMessage.setData(null);
        responseMessage.setMessage(platformMessage);
        return responseMessage;
    }

    private PlatformService platformService() {
        return SpringUtil.getBean(PlatformService.class);
    }

    private RedisService redisService() {
        return SpringUtil.getBean(RedisService.class);
    }

    private DataUnitToDTO dataUnitToDTO() {
        return SpringUtil.getBean(DataUnitToDTO.class);
    }

    private void send(Envelope envelope) {
        HTTPTask.newBuilder().setUrl(URL).build().send(envelope);
    }

}
