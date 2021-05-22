package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.AsignacionMaquinaria;

@Repository
public interface AsignacionMaquinariaRepository extends JpaRepository<AsignacionMaquinaria, Long>{

}
