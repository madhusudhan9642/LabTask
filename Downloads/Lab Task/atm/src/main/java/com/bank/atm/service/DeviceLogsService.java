package com.bank.atm.service;

import com.bank.atm.model.DeviceLogs;
import com.bank.atm.repository.DeviceLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeviceLogsService {

    @Autowired
    private DeviceLogsRepository deviceLogsRepository;

    public List<DeviceLogs> getFailures() {
        return deviceLogsRepository.findByStatus("malfunctioned");
    }
    // New method to get device logs by atmId
    public List<DeviceLogs> getDeviceLogsByAtmId(Integer atmId) {
        return deviceLogsRepository.findByAtmId(atmId);
    }
}

