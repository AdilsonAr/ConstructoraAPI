package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Empleado;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
}
