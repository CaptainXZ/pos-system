package com.example.pos_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.pos_system.model.Promotion;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, String> {

}
