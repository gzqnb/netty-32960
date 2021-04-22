package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.CommonProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


public interface CommonPropertyRepository extends JpaRepository<CommonProperty, Integer>,
        JpaSpecificationExecutor<CommonProperty> {

    @Query(value ="select max(t.id) from CommonProperty t")
    Integer getMaxId();

    //select cpv.value from common_property cp left join common_property_value cpv on cp.id = cpv.property_id where cpv.data_station_id = 2000006 and cp.name='VehVIN'

    @Query(value = "select cpv.value from CommonProperty cp left join CommonPropertyValue cpv on cp.id = cpv.propertyId where cpv.dataStationId = ?1 and cp.name = 'VehVIN'")
    String findVINByDataStationId(Integer dataStationId);

}
