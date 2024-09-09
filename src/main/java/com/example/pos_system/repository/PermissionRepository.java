package com.example.pos_system.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pos_system.model.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {
	Page<Permission> findByStatus(String status, Pageable pageable);
}