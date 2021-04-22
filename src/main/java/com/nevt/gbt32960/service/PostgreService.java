package com.nevt.gbt32960.service;

import com.alibaba.fastjson.JSON;
import com.nevt.gbt32960.message.Parameter;
import com.nevt.gbt32960.repository.DataStationRepository;
import com.nevt.gbt32960.repository.DeviceRepository;
import com.nevt.gbt32960.repository.DeviceTypeRepository;
import com.nevt.gbt32960.repository.ParameterDefineRepository;
import com.nevt.gbt32960.repository.entity.DataStation;
import com.nevt.gbt32960.repository.entity.Device;
import com.nevt.gbt32960.repository.entity.DeviceType;
import com.nevt.gbt32960.repository.entity.ParameterDefine;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PostgreService {

    @Resource
    private DataStationRepository dataStationRepository;

    @Resource
    private DeviceRepository deviceRepository;

    @Resource
    private ParameterDefineRepository parameterDefineRepository;

    @Resource
    private DeviceTypeRepository deviceTypeRepository;

    public Optional<List<Device>> findDevices(int dataStationId) {
        return deviceRepository.findDevicesByDataStationId(dataStationId);
    }

    public Optional<List<ParameterDefine>> findParameterDefines(int deviceTypeId) {
        return parameterDefineRepository.findParameterDefinesByDeviceTypeId(deviceTypeId);
    }

    public List<DeviceType> findDeviceTypes(int dataStationTypeId) {
        Optional<List<DeviceType>> deviceTypesByDataStationTypeId = deviceTypeRepository.findDeviceTypesByDataStationTypeId(dataStationTypeId);
        if (deviceTypesByDataStationTypeId.isPresent()) {
            return deviceTypesByDataStationTypeId.get();
        }
        throw new NoSuchElementException("No DeviceType");
    }


    public Optional<DataStation> findDataStationByName(String name) {
        return dataStationRepository.findDataStationByName(name);
    }

    public void saveDataStation(DataStation dataStation) {
        dataStationRepository.save(dataStation);
    }

    public void saveAllDevice(List<Device> devices) {
        deviceRepository.saveAll(devices);
    }

    public int findDataStationMaxId() {
        return dataStationRepository.getMaxId();
    }

    public int findDeviceMaxId() {
        return deviceRepository.getMaxId();
    }

}
