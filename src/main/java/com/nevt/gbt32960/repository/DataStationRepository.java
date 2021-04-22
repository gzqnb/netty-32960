package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.DataStation;
import com.nevt.gbt32960.repository.entity.DeviceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DataStationRepository extends JpaRepository<DataStation, Integer>,
        JpaSpecificationExecutor<DataStation> {

    @Query(value ="select max(t.id) from DataStation t")
    Integer getMaxId();

    @Query(value = "select id from DataStation")
    List<Integer> findAllId();

    @Query(value = "select ds.dataStationTypeId from DataStation ds where ds.id = ?1")
    Integer findDataStationTypeId(Integer dataStationId);

    List<DataStation> findAllByDataStationTypeId(Integer dataStationTypeId);

    Optional<DataStation> findDataStationByName(String name);

}