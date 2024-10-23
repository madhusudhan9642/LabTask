package com.bank.atm.service;

import com.bank.atm.model.TransactionLogs;
import com.bank.atm.repository.TransactionLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class TransactionLogsService {

    @Autowired
    private TransactionLogsRepository transactionLogsRepository;

    public Map<String, Long> getTransactionBreakdown() {
        Map<String, Long> breakdown = new HashMap<>();
        breakdown.put("Deposit", transactionLogsRepository.countByTransactionType("Deposit"));
        breakdown.put("Cash Withdrawal", transactionLogsRepository.countByTransactionType("Cash Withdrawal"));
        breakdown.put("Balance Information", transactionLogsRepository.countByTransactionType("Balance Information"));
        return breakdown;
    }
    // New method to get transaction logs by atmId
    public List<TransactionLogs> getTransactionLogsByAtmId(Integer atmId) {
        return transactionLogsRepository.findByAtmId(atmId);
    }


    // Method to get transaction logs by atmId and transactionType
    public List<TransactionLogs> getTransactionLogsByAtmIdAndType(Integer atmId, String transactionType) {
        return transactionLogsRepository.findByAtmIdAndTransactionType(atmId, transactionType);
    }

    // Method to get transaction logs by atmId and status
    public List<TransactionLogs> getTransactionLogsByAtmIdAndStatus(Integer atmId, String status) {
        return transactionLogsRepository.findByAtmIdAndStatus(atmId, status);
    }
}

