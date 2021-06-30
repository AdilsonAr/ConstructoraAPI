package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Acceso;
import com.das.model.Proyecto;
import com.das.model.Usuario;

//single responsibility principle
//cada entidad tiene una clase de estereotipo repository para encapsular la logica de acceso a datos
@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{
	public List<Acceso> findByProyecto(Proyecto proyecto);
	public List<Acceso> findByUsuario(Usuario usuario);
	public Acceso findByUsuarioAndProyecto(Usuario usuario, Proyecto proyecto);
}
