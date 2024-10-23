package com.bank.atm.controller;

import com.bank.atm.model.TransactionLogs;
import com.bank.atm.service.TransactionLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/atm")
public class TransactionLogsController {

    @Autowired
    private TransactionLogsService transactionLogsService;

    @GetMapping("/transactions/breakdown")
    public Map<String, Long> getTransactionBreakdown() {
        return transactionLogsService.getTransactionBreakdown();
    }

    // New endpoint to get transaction logs by atmId
    @GetMapping("/{atmId}/transactions")
    public List<TransactionLogs> getTransactionLogsByAtmId(@PathVariable Integer atmId) {
        return transactionLogsService.getTransactionLogsByAtmId(atmId);
    }

    // Endpoint to get transaction logs by atmId and transaction type
    @GetMapping("/{atmId}/transactions/type/{transactionType}")
    public List<TransactionLogs> getTransactionLogsByAtmIdAndType(
            @PathVariable Integer atmId,
            @PathVariable String transactionType) {
        return transactionLogsService.getTransactionLogsByAtmIdAndType(atmId, transactionType);
    }

    // Endpoint to get transaction logs by atmId and status
    @GetMapping("/{atmId}/transactions/status/{status}")
    public List<TransactionLogs> getTransactionLogsByAtmIdAndStatus(
            @PathVariable Integer atmId,
            @PathVariable String status) {
        return transactionLogsService.getTransactionLogsByAtmIdAndStatus(atmId, status);
    }
}
