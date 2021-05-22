package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Maquinaria;

@Repository
public interface MaquinariaRepository extends JpaRepository<Maquinaria, Long>{

}
