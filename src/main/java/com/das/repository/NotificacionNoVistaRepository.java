package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Notificacion;
import com.das.model.NotificacionNoVista;
import com.das.model.Usuario;

@Repository
public interface NotificacionNoVistaRepository extends JpaRepository<NotificacionNoVista, Long>{
	public abstract List<NotificacionNoVista> findByUsuario(Usuario u);
	public abstract NotificacionNoVista findByNotificacion(Notificacion u);
}
