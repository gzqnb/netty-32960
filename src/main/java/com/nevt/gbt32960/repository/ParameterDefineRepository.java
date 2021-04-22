package com.nevt.gbt32960.repository;

import com.nevt.gbt32960.repository.entity.ParameterDefine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ParameterDefineRepository extends JpaRepository<ParameterDefine, Integer>,
        JpaSpecificationExecutor<ParameterDefine> {

    @Query(value = "select max(t.id) from ParameterDefine t")
    Integer getMaxId();


    Optional<List<ParameterDefine>> findParameterDefinesByDeviceTypeId(int deviceTypeId);

}