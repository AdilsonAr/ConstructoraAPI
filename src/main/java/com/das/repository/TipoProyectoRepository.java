package com.das.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.TipoProyecto;

@Repository
public interface TipoProyectoRepository extends JpaRepository<TipoProyecto, Long>{
	public TipoProyecto findByTipo(String tipo);
}
