package com.das.reportes;

import java.time.LocalDateTime;

import com.das.dto.ClienteDto;

public class Comprobante {
	private String nombreProyecto;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private String tipoProyecto;
	private double costo;
	private ClienteDto cliente;
	
	public Comprobante(String nombreProyecto, LocalDateTime inicio, LocalDateTime fin, String tipoProyecto,
			double costo, ClienteDto cliente) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.inicio = inicio;
		this.fin = fin;
		this.tipoProyecto = tipoProyecto;
		this.costo = costo;
		this.cliente = cliente;
	}
	public String getNombreProyecto() {
		return nombreProyecto;
	}
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}
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
	public String getTipoProyecto() {
		return tipoProyecto;
	}
	public void setTipoProyecto(String tipoProyecto) {
		this.tipoProyecto = tipoProyecto;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public Comprobante() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
