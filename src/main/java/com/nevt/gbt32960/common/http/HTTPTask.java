package com.nevt.gbt32960.common.http;

import com.alibaba.fastjson.JSON;
import com.nevt.gbt32960.common.dto.Envelope;
import com.nevt.gbt32960.common.enums.BlockingQueueEnum;
import com.nevt.gbt32960.common.enums.RejectedExecutionHandlerEnum;
import com.nevt.gbt32960.common.factory.ThreadFactoryCustomer;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class HTTPTask {

    private final static ExecutorService executorService;

    private final HttpPost httpPost;

    private final static HttpClient httpClient = HTTPCustomer.createClient();

    static {
        executorService = ThreadFactoryCustomer.executorServiceCustomer(
                5,
                20,
                5L,
                ThreadFactoryCustomer.threadFactorySetName("http-quick"),
                BlockingQueueEnum.ARRAY,
                RejectedExecutionHandlerEnum.CALLER_RUNS
        );
    }

    private HTTPTask(Builder builder) {
        httpPost = builder.httpPost;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public void send(Envelope data) {
        executorService.execute(task(data));
    }

    private Runnable task(Envelope data) {
        return () -> {
            System.out.println(Thread.currentThread());
            String jsonData = JSON.toJSONString(data);
            StringEntity stringEntity = new StringEntity(jsonData, ContentType.APPLICATION_JSON);
            httpPost.setEntity(stringEntity);
            HttpResponse httpResponse = null;
            try {
                httpResponse = httpClient.execute(httpPost);
                HttpEntity httpEntity = httpResponse.getEntity();
                log.info("to http success! ==> " + EntityUtils.toString(httpEntity));
            } catch (IOException e) {
                log.trace("exception: ==> " + e.getMessage());
            }
            try {
                TimeUnit.MILLISECONDS.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    public static final class Builder {
        private HttpPost httpPost;

        private Builder() {
        }

        @Nonnull
        public Builder setUrl(@Nonnull String val) {
            httpPost = HTTPCustomer.creatHttpPost(val);
            return this;
        }

        @Nonnull
        public HTTPTask build() {
            return new HTTPTask(this);
        }
    }
}
