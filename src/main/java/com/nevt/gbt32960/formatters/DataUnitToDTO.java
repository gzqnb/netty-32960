package com.nevt.gbt32960.formatters;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nevt.gbt32960.common.dto.Envelope;
import com.nevt.gbt32960.common.dto.Information;
import com.nevt.gbt32960.common.enums.DataStationEnum;
import com.nevt.gbt32960.enums.DeviceEnum;
import com.nevt.gbt32960.modle.*;
import com.nevt.gbt32960.repository.DataStationRepository;
import com.nevt.gbt32960.repository.DeviceRepository;
import com.nevt.gbt32960.repository.DeviceTypeRepository;
import com.nevt.gbt32960.repository.ParameterDefineRepository;
import com.nevt.gbt32960.repository.entity.DataStation;
import com.nevt.gbt32960.repository.entity.Device;
import com.nevt.gbt32960.repository.entity.DeviceType;
import com.nevt.gbt32960.repository.entity.ParameterDefine;
import com.nevt.gbt32960.service.PostgreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Slf4j
@Component
public class DataUnitToDTO {

    @Resource
    private PostgreService postgreService;

    public Envelope toDTO(DataUnit dataUnit) {
        Optional<DataStation> exits = isExits(dataUnit.getFrameHeader().getVin());
        // optional的isprsent方法判断是否搜索到数据
        if (exits.isPresent()) {
            log.info("find");
            return find(dataUnit);
        } else {
            log.info("save");
            return save(dataUnit);
        }
    }

    private Envelope find(DataUnit dataUnit) {

        Envelope envelope = new Envelope();

        List<Information> content = new ArrayList<>();

        isExits(dataUnit.getFrameHeader().getVin()).ifPresent(d -> {
            envelope.setDataStationId(d.getId());
            envelope.setDataStationTypeId(d.getDataStationTypeId());
            envelope.setCTime(TimeFormat.zonedDateTimeToDate(dataUnit.getDataCollectionTime()));

            Optional<List<Device>> devicesByDataStationId = postgreService.findDevices(d.getId());

            devicesByDataStationId.ifPresent(dl -> {
                dl.forEach(dll -> {
                    Information information = new Information();

                    Map<String, Object> values = new HashMap<>();

                    Optional<List<ParameterDefine>> parameterDefinesByDeviceTypeId = postgreService.findParameterDefines(dll.getDeviceTypeId());

                    List<Motor> motorList = dataUnit.getMotors();
                    Engine engine = dataUnit.getEngine();
                    Alarm alarm = dataUnit.getAlarm();
                    Vehicle vehicle = dataUnit.getVehicle();
                    FuelCell fuelCell = dataUnit.getFuelCell();
                    Extremum extremum = dataUnit.getExtremum();

                    parameterDefinesByDeviceTypeId.ifPresent(pd -> {
                        pd.forEach(param -> {

                            motorList.forEach(m -> {
                                JSONObject motors = JSONObject.parseObject(JSON.toJSONString(m));
                                List<String> collect = motors.keySet().stream().filter(k -> k.equals(param.getName())).collect(Collectors.toList());
                                collect.forEach(mk -> values.put(mk, motors.get(mk)));
                            });

                            JSONObject engineJson = JSONObject.parseObject(JSON.toJSONString(engine));
                            List<String> engineCollect = engineJson.keySet().stream().filter(k -> k.equals(param.getName())).collect(Collectors.toList());
                            engineCollect.forEach(mk -> values.put(mk, engineJson.get(mk)));

                            JSONObject alarmJson = JSONObject.parseObject(JSON.toJSONString(alarm));
                            List<String> alarmCollect = alarmJson.keySet().stream().filter(k -> k.equals(param.getName())).collect(Collectors.toList());
                            alarmCollect.forEach(mk -> values.put(mk, alarmJson.get(mk)));

                            JSONObject vehicleJson = JSONObject.parseObject(JSON.toJSONString(vehicle));
                            List<String> vehicleCollect = vehicleJson.keySet().stream().filter(k -> k.equals(param.getName())).collect(Collectors.toList());
                            vehicleCollect.forEach(mk -> values.put(mk, vehicleJson.get(mk)));

                            JSONObject fuelCellJson = JSONObject.parseObject(JSON.toJSONString(fuelCell));
                            List<String> fuelCellCollect = fuelCellJson.keySet().stream().filter(k -> k.equals(param.getName())).collect(Collectors.toList());
                            fuelCellCollect.forEach(mk -> values.put(mk, fuelCellJson.get(mk)));

                            JSONObject extremumJson = JSONObject.parseObject(JSON.toJSONString(extremum));
                            List<String> extremumCollect = extremumJson.keySet().stream().filter(k -> k.equals(param.getName())).collect(Collectors.toList());
                            extremumCollect.forEach(mk -> values.put(mk, extremumJson.get(mk)));

                        });
                    });
                    information.setDeviceIndex(dll.getDeviceIndex());
                    information.setDeviceTypeId(dll.getDeviceTypeId());
                    information.setDeviceId(dll.getId());

                    information.setValues(values);

                    content.add(information);
                });
                envelope.setContent(content);
                envelope.setUTime(new Date());
            });

        });

        return envelope;
    }

    private List<String> collect(String jsonString, String paramName) {
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        return jsonObject.keySet().stream().filter(k -> k.equals(paramName)).collect(Collectors.toList());
    }

    private Envelope save(DataUnit dataUnit) {
        DataStation dataStation = toDataStation(dataUnit);
        postgreService.saveDataStation(dataStation);
        List<Device> devices = toDevice(
                postgreService.findDeviceTypes(dataStation.getDataStationTypeId()),
                dataStation.getId(),
                dataUnit);
        postgreService.saveAllDevice(devices);
        return find(dataUnit);
    }

    public DataStation toDataStation(DataUnit dataUnit) {
        DataStation dataStation = new DataStation();
        AtomicInteger atomicInteger = new AtomicInteger(postgreService.findDataStationMaxId());

        dataStation.setDataStationTypeId(DataStationEnum.VEHICLE.getTypeId());
        dataStation.setId(atomicInteger.incrementAndGet());
        dataStation.setLatitude(dataUnit.getLocation().getGpsLatitude());
        dataStation.setLongitude(dataUnit.getLocation().getGpsLongitude());
        dataStation.setName(dataUnit.getFrameHeader().getVin());
        return dataStation;
    }

    private List<Device> toDevice(List<DeviceType> deviceTypeList, int dataStationId, DataUnit dataUnit) {

        List<Device> result = new ArrayList<>(deviceTypeList.size());
        int dId = postgreService.findDeviceMaxId();
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.set(dId);

        deviceTypeList.forEach(dt -> {

            if (dt.getId() == DeviceEnum.VEHICLE.getDeviceTypeId()) {
                result.add(
                        device(dataStationId, atomicInteger, dt.getId(), dataUnit.getVehicle().getStatus())
                );
            }

            if (dt.getId() == DeviceEnum.MOTOR.getDeviceTypeId()) {
                dataUnit.getMotors().forEach(m -> {
                    result.add(
                            device(dataStationId, atomicInteger, dt.getId(), m.getStatus())
                    );
                });
            }

            if (dt.getId() == DeviceEnum.FUELCELL.getDeviceTypeId()) {
                result.add(
                        device(dataStationId, atomicInteger, dt.getId(), dataUnit.getFuelCell().getStatus())
                );
            }

            if (dt.getId() == DeviceEnum.ENGINE.getDeviceTypeId()) {
                result.add(
                        device(dataStationId, atomicInteger, dt.getId(), dataUnit.getEngine().getStatus())
                );
            }

            if (dt.getId() == DeviceEnum.LOCATION.getDeviceTypeId()) {
                result.add(
                        device(dataStationId, atomicInteger, dt.getId(), dataUnit.getLocation().getStatus())
                );
            }

            if (dt.getId() == DeviceEnum.EXTREMUM.getDeviceTypeId()) {
                result.add(
                        device(dataStationId, atomicInteger, dt.getId(), "NONE")
                );
            }

            if (dt.getId() == DeviceEnum.ALARM.getDeviceTypeId()) {
                result.add(
                        device(dataStationId, atomicInteger, dt.getId(), "NONE")
                );
            }

        });

        return result;
    }

    private Optional<DataStation> isExits(String name) {
        return postgreService.findDataStationByName(name);
    }

    public Device device(int dataStationId, AtomicInteger atomicInteger, int deviceTypeId, String status) {
        Device device = new Device();
        device.setDeviceIndex(0);
        device.setDataStationId(dataStationId);
        device.setId(atomicInteger.incrementAndGet());
        device.setDeviceTypeId(deviceTypeId);
        device.setStatus(status);
        return device;
    }

}
