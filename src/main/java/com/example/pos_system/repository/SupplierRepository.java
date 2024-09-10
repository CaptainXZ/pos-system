package com.example.pos_system.repository;

import org.springframework.stereotype.Repository;
import com.example.pos_system.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, String>{
	
}
