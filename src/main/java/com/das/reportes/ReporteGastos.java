package com.das.reportes;

import java.util.List;

import com.das.dto.ResponseProyectoDto;

public class ReporteGastos {
	private List<ResponseProyectoDto> proyectos;
	private double gastos;
	public ReporteGastos(List<ResponseProyectoDto> proyectos, double gastos) {
		super();
		this.proyectos = proyectos;
		this.gastos = gastos;
	}
	public List<ResponseProyectoDto> getProyectos() {
		return proyectos;
	}
	public void setProyectos(List<ResponseProyectoDto> proyectos) {
		this.proyectos = proyectos;
	}
	public double getGastos() {
		return gastos;
	}
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	
	
}
