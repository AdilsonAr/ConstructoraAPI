package com.das.reportes;

import java.time.LocalDateTime;
import java.util.List;

import com.das.dto.ResponseProyectoDto;

public class ReporteGanancias {
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private List<ResponseProyectoDto> proyectos;
	private double ganancias;
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
	public List<ResponseProyectoDto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<ResponseProyectoDto> proyectos) {
		this.proyectos = proyectos;
	}
	public double getGanancias() {
		return ganancias;
	}
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	
}
