package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DeviceTypeRepository extends JpaRepository<DeviceType, Integer>,
        JpaSpecificationExecutor<DeviceType> {

    @Query(value ="select max(t.id) from DeviceType t")
    Integer getMaxId();

    Optional<List<DeviceType>> findDeviceTypesByDataStationTypeId(int dataStationTypeId);

}