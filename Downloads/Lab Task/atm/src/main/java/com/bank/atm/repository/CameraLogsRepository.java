package com.bank.atm.repository;

import com.bank.atm.model.CameraLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Date;
import java.util.List;

public interface CameraLogsRepository extends JpaRepository<CameraLogs, Integer> {
    List<CameraLogs> findByTimestampBetween(Date startTime, Date endTime);

    // New method to find by atmId and timestamp range
    List<CameraLogs> findByAtmIdAndTimestampBetween(Integer atmId, Date startTime, Date endTime);

}