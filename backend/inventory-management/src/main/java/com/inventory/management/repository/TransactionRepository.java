package com.inventory.management.repository;

import com.inventory.management.entity.Transaction;
import com.inventory.management.entity.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByType(TransactionType type);

    List<Transaction> findByCustomerId(Long customerId);

    List<Transaction> findBySaleId(Long saleId);
}