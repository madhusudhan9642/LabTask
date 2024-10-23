package com.bank.atm.repository;

import com.bank.atm.model.TransactionLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TransactionLogsRepository extends JpaRepository<TransactionLogs, Integer> {
    long countByTransactionType(String transactionType);

    List<TransactionLogs> findByAtmId(Integer atmId);

    // Fetch transaction logs by atmId and transaction type
    List<TransactionLogs> findByAtmIdAndTransactionType(Integer atmId, String transactionType);

    // Fetch transaction logs by atmId and status
    List<TransactionLogs> findByAtmIdAndStatus(Integer atmId, String status);

}