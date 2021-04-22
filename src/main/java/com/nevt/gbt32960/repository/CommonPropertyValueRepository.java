package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.CommonPropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CommonPropertyValueRepository extends JpaRepository<CommonPropertyValue, Integer>,
        JpaSpecificationExecutor<CommonPropertyValue> {

    @Query(value = "select max(t.id) from CommonPropertyValue t")
    Integer getMaxId();
}