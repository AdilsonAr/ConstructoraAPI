package com.das.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Canal;
import com.das.model.Notificacion;
import com.das.model.Proyecto;
import com.das.repository.NotificacionRepository;

@Service
public class NotificacionService{
	@Autowired
	NotificacionRepository repo;
	@Autowired
	CanalService canalService;
	public void createFinalizacion(Proyecto p) {
		Canal canal=canalService.readNombre("Proyectos");
		Notificacion notificacion=new Notificacion(canal, "El proyecto "+p.getNombre(
				)+" con identificador "+p.getIdProyecto()+" ha terminado y sus recursos ahora estan disponibles"
				, LocalDateTime.now());
		Notificacion creada=repo.save(notificacion);
		canal.myNotify(creada);
	}
	
	public List<Notificacion> readCanal(Canal c){
		return repo.findByCanal(c);
	}
}
