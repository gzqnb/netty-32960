package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.DataStationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface DataStationTypeRepository extends JpaRepository<DataStationType, Integer>,
        JpaSpecificationExecutor<DataStationType> {

    @Query(value ="select max(t.id) from DataStationType t")
    Integer getMaxId();

}