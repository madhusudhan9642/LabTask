package com.bank.atm.service;

import com.bank.atm.model.CameraLogs;
import com.bank.atm.repository.CameraLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CameraLogsService {

    @Autowired
    private CameraLogsRepository cameraLogsRepository;

    public List<CameraLogs> getCameraRecordsByTimeRange(Date startTime, Date endTime) {
        return cameraLogsRepository.findByTimestampBetween(startTime, endTime);
    }
    public List<CameraLogs> getCameraLogsByAtmIdAndTimeRange(Integer atmId, Date startTime, Date endTime) {
        return cameraLogsRepository.findByAtmIdAndTimestampBetween(atmId, startTime, endTime);
    }
}
