package com.nevt.gbt32960.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "data_station")
@JsonIgnoreProperties(ignoreUnknown = true)
@EntityListeners(AuditingEntityListener.class)
public class DataStation implements Serializable {
    private static final long serialVersionUID = 485279287888644527L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "data_station_type_id")
    private Integer dataStationTypeId;

    @Column(name = "name")
    private String name;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "latitude")
    private double latitude;

}