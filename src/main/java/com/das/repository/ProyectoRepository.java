package com.das.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Cliente;
import com.das.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
	//Proyectos que se están ejecutando, entre un rango de fechas
	public List<Proyecto> findByInicioBeforeAndFinAfter(LocalDateTime inicio, LocalDateTime fin);
	//Proyectos terminados entre un rango de fechas
	public List<Proyecto> findByFinAfterAndFinBefore(LocalDateTime inicio, LocalDateTime fin);
	public List<Proyecto> findByCliente(Cliente cliente);
}
