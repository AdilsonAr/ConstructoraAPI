package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.AsignacionEmpleado;
import com.das.model.Empleado;
import com.das.model.Proyecto;

@Repository
public interface AsignacionEmpleadoRepository extends JpaRepository<AsignacionEmpleado, Long>{
	public abstract List<AsignacionEmpleado> findByProyecto(Proyecto proyecto);
	public abstract List<AsignacionEmpleado> findByEmpleado(Empleado empleado);
}