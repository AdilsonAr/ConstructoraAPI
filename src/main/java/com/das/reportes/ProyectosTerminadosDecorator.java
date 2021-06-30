package com.das.reportes;

import java.time.LocalDateTime;
import java.util.List;

import com.das.model.Proyecto;

public abstract class ProyectosTerminadosDecorator implements TerminadosPeriodo{
	protected TerminadosPeriodo terminadosPeriodo;

	public TerminadosPeriodo getTerminadosPeriodo() {
		return terminadosPeriodo;
	}

	public void setTerminadosPeriodo(TerminadosPeriodo terminadosPeriodo) {
		this.terminadosPeriodo = terminadosPeriodo;
	}
	
	@Override
	public List<Proyecto> getProyectos(LocalDateTime inicio, LocalDateTime fin) {
		return this.terminadosPeriodo.getProyectos(inicio, fin);
	}
	
	protected LocalDateTime inicio;
	protected LocalDateTime fin;
	
	public LocalDateTime getInicio() {
		return inicio;
	}

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

}
