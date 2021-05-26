package com.das.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
	public List<Proyecto> findByInicioAfterAndFinBefore(LocalDate inicio, LocalDate fin);
}
