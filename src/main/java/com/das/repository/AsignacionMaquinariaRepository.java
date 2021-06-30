package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.AsignacionMaquinaria;
import com.das.model.Maquinaria;
import com.das.model.Proyecto;

@Repository
public interface AsignacionMaquinariaRepository extends JpaRepository<AsignacionMaquinaria, Long>{
	public abstract List<AsignacionMaquinaria> findByProyecto(Proyecto proyecto);
	public abstract List<AsignacionMaquinaria> findByMaquinaria(Maquinaria maquinaria);
}
