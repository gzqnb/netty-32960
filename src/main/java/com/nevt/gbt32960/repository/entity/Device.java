package com.nevt.gbt32960.repository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "device")
@JsonIgnoreProperties(ignoreUnknown = true)
@EntityListeners(AuditingEntityListener.class)
public class Device implements Serializable {
    private static final long serialVersionUID = -53912920611468457L;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "device_index")
    private Integer deviceIndex;

    @Column(name = "device_type_id")
    private Integer deviceTypeId;

    @Column(name = "status")
    private String status;

    @Column(name = "data_station_id")
    private Integer dataStationId;

}