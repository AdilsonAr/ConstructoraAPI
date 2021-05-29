package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Acceso;
import com.das.model.Proyecto;
import com.das.model.Usuario;

@Repository
public interface AccesoRepository extends JpaRepository<Acceso, Long>{
	public List<Acceso> findByProyecto(Proyecto proyecto);
	public List<Acceso> findByUsuario(Usuario usuario);
	public Acceso findByUsuarioAndProyecto(Usuario usuario, Proyecto proyecto);
}
