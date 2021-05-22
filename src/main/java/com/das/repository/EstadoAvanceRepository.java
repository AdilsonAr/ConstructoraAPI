package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.EstadoAvance;

@Repository
public interface EstadoAvanceRepository extends JpaRepository<EstadoAvance, Long>{

}
