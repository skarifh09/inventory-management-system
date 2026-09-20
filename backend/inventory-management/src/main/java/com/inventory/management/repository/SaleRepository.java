package com.inventory.management.repository;

import com.inventory.management.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    List<Sale> findByCustomerId(Long customerId);

    List<Sale> findByUserId(Long userId);
}