package com.bank.atm.repository;

import com.bank.atm.model.DeviceLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface DeviceLogsRepository extends JpaRepository<DeviceLogs, Integer>, JpaSpecificationExecutor<DeviceLogs> {
    List<DeviceLogs> findByStatus(String status);

    List<DeviceLogs> findByAtmId(Integer atmId);

}