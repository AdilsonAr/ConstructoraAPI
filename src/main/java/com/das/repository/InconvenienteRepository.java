package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Inconveniente;

@Repository
public interface InconvenienteRepository extends JpaRepository<Inconveniente, Long>{

}
