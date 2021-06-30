package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.AsignacionMateriaPrima;
import com.das.model.MateriaPrima;
import com.das.model.Proyecto;

@Repository
public interface AsignacionMateriaPrimaRepository extends JpaRepository<AsignacionMateriaPrima, Long>{
	public abstract List<AsignacionMateriaPrima> findByProyecto(Proyecto proyecto);
	public abstract List<AsignacionMateriaPrima> findByMateriaPrima(MateriaPrima materiaPrima);
}
