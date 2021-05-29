package com.das.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.das.model.Proyecto;

public class ResponseProyectoDto {
	private long idProyecto;
	private String nombre;
	private double latitud;
	private double longitud;
	private double porcentajeAvance;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	private String tipoProyecto;
	private String estadoAvance;
	private List<ResponseInconvenienteDto> inconvenientes;
	private ClienteDto cliente;
	public long getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(long idProyecto) {
		this.idProyecto = idProyecto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getPorcentajeAvance() {
		return porcentajeAvance;
	}
	public void setPorcentajeAvance(double porcentajeAvance) {
		this.porcentajeAvance = porcentajeAvance;
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
	public String getEstadoAvance() {
		return estadoAvance;
	}
	public void setEstadoAvance(String estadoAvance) {
		this.estadoAvance = estadoAvance;
	}
	public List<ResponseInconvenienteDto> getInconvenientes() {
		return inconvenientes;
	}
	public void setInconvenientes(List<ResponseInconvenienteDto> inconvenientes) {
		this.inconvenientes = inconvenientes;
	}
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public ResponseProyectoDto(long idProyecto, String nombre, double latitud, double longitud, double porcentajeAvance,
			LocalDateTime inicio, LocalDateTime fin, String tipoProyecto, String estadoAvance,
			List<ResponseInconvenienteDto> inconvenientes, ClienteDto cliente) {
		super();
		this.idProyecto = idProyecto;
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.porcentajeAvance = porcentajeAvance;
		this.inicio = inicio;
		this.fin = fin;
		this.tipoProyecto = tipoProyecto;
		this.estadoAvance = estadoAvance;
		this.inconvenientes = inconvenientes;
		this.cliente = cliente;
	}
	public static ResponseProyectoDto toDto(Proyecto p) {
		List<ResponseInconvenienteDto> inconvenientes=new ArrayList<>();
		(p.getInconvenientes()).forEach(x->inconvenientes.add(ResponseInconvenienteDto.toDto(x)));
		return new ResponseProyectoDto(p.getIdProyecto(), p.getNombre(), 
				p.getLatitud(), p.getLongitud(), p.getPorcentajeAvance(), 
				p.getInicio(), p.getFin(), p.getTipoProyecto().getTipo(), 
				p.getEstadoAvance().getEstado(), inconvenientes, ClienteDto.toDto(p.getCliente()));
	}
}
