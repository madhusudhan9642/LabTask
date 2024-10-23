package com.bank.atm.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "anomaly_logs")
public class AnomalyLogs {

    @Id
    @Column(name = "anomaly_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer anomalyId;

    @Column(name = "transaction_id")
    private Integer transactionId;

    @Column(name = "atm_id", nullable = false)
    private Integer atmId;

    @Column(name = "anomaly_type", nullable = false)
    private String anomalyType;

    @Column(name = "timestamp", nullable = false)
    private Date timestamp;

    @Column(name = "description")
    private String description;

}
