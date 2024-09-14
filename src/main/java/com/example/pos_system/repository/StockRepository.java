package com.example.pos_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pos_system.model.Stock;


@Repository
public interface StockRepository extends JpaRepository<Stock,String> {
    
}
