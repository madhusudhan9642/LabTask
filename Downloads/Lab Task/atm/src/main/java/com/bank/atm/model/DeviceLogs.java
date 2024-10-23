package com.bank.atm.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "device_logs")
public class DeviceLogs {

    @Id
    @Column(name = "device_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deviceId;

    @Column(name = "atm_id", nullable = false)
    private Integer atmId;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "timestamp", nullable = false)
    private Date timestamp;

    @Column(name = "error_message")
    private String errorMessage;

}
