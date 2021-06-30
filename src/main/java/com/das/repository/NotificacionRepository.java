package com.das.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.das.model.Canal;
import com.das.model.Notificacion;

@Repository
public interface NotificacionRepository extends JpaRepository<Notificacion, Long>{
	public abstract List<Notificacion> findByCanal(Canal c);
}
