package com.bank.atm.controller;

import com.bank.atm.model.CameraLogs;
import com.bank.atm.service.CameraLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@RestController
//@RequestMapping("/api/atm")
public class CameraLogsController {

    @Autowired
    private CameraLogsService cameraLogsService;

    @GetMapping("/camera/download")
    public List<CameraLogs> downloadCameraRecords(
            @RequestParam("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date startTime,
            @RequestParam("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date endTime) {
        return cameraLogsService.getCameraRecordsByTimeRange(startTime, endTime);
    }
    @GetMapping("/camera/{atmId}")
    public List<CameraLogs> getCameraLogsByAtmId(
            @PathVariable Integer atmId,
            @RequestParam("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date startTime,
            @RequestParam("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date endTime) {
        return cameraLogsService.getCameraLogsByAtmIdAndTimeRange(atmId, startTime, endTime);
    }
}

