package com.bank.atm.repository;

import com.bank.atm.model.AnomalyLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AnomalyLogsRepository extends JpaRepository<AnomalyLogs, Integer>, JpaSpecificationExecutor<AnomalyLogs> {

}