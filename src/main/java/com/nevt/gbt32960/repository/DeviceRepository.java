package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface DeviceRepository extends JpaRepository<Device, Integer>,
        JpaSpecificationExecutor<Device> {

    @Query(value = "select max(t.id) from Device t")
    Integer getMaxId();

    Optional<List<Device>> findDevicesByDataStationId(int dataStationId);

}