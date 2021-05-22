package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Acceso;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{

}
