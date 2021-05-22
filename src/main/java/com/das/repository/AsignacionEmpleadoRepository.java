package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.AsignacionEmpleado;

@Repository
public interface AsignacionEmpleadoRepository extends JpaRepository<AsignacionEmpleado, Long>{

}
