package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.AsignacionMateriaPrima;

@Repository
public interface AsignacionMateriaPrimaRepository extends JpaRepository<AsignacionMateriaPrima, Long>{

}
