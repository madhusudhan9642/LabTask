package com.bank.atm.controller;

import com.bank.atm.model.DeviceLogs;
import com.bank.atm.service.DeviceLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/atm")
public class DeviceLogsController {

    @Autowired
    private DeviceLogsService deviceLogsService;

    @GetMapping("/device/failures")
    public List<DeviceLogs> getFailures() {
        return deviceLogsService.getFailures();
    }
    // New endpoint to get device logs by atmId
    @GetMapping("/{atmId}")
    public List<DeviceLogs> getDeviceLogsByAtmId(@PathVariable Integer atmId) {
        return deviceLogsService.getDeviceLogsByAtmId(atmId);
    }
}

