package com.das.reportes;

import java.time.LocalDateTime;
import java.util.List;

import com.das.configuration.SpringContext;
import com.das.model.Proyecto;
import com.das.service.ProyectoService;

public class ProyectosTerminados implements TerminadosPeriodo{
	private ProyectoService pservice =SpringContext.getBean(ProyectoService.class);
	@Override
	public List<Proyecto> getProyectos(LocalDateTime inicio,  LocalDateTime fin) {
		return pservice.readTerminadosRango(inicio, fin);
	}

}
