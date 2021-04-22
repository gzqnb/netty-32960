package com.nevt.gbt32960.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "device_type")
@JsonIgnoreProperties(ignoreUnknown = true)
@EntityListeners(AuditingEntityListener.class)
public class DeviceType implements Serializable {
    private static final long serialVersionUID = 106469502944492174L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "column_family")
    private String columnFamily;

    @Column(name = "data_station_type_id")
    private Integer dataStationTypeId;

}