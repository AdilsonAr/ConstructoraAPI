package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Canal;
import com.das.model.Suscripcion;
import com.das.model.Usuario;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Long>{
	public abstract List<Suscripcion> findByUsuario(Usuario usuario);
	public abstract List<Suscripcion> findByCanal(Canal canal);
}
