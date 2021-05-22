package com.das.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProyecto;
	@OneToMany(mappedBy = "proyecto",cascade = CascadeType.ALL)
	private List<Acceso> accesos;
	private String nombre;
	private double latitud;
	private double longitud;
	private double porcentajeAvance;
	private LocalDateTime inicio;
	private LocalDateTime fin;
	@OneToMany(mappedBy = "proyecto")
	private List<Inconveniente> inconvenientes;
	@ManyToOne
	@JoinColumn(name = "idTipoProyecto")
	private TipoProyecto tipoProyecto;
	@ManyToOne
	@JoinColumn(name = "idEstadoAvance")
	private EstadoAvance estadoAvance;
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	@OneToMany(mappedBy = "proyecto")
	private List<AsignacionMaquinaria> asignacionMaquinarias;
	@OneToMany(mappedBy = "proyecto")
	private List<AsignacionEmpleado> asignacionEmpleado;
	@OneToMany(mappedBy = "proyecto")
	private List<AsignacionMateriaPrima> asignacionMateriaPrimas;
	public long getIdProyecto() {
		return idProyecto;
	}
	public void setIdProyecto(long idProyecto) {
		this.idProyecto = idProyecto;
	}
	public List<Acceso> getAccesos() {
		return accesos;
	}
	public void setAccesos(List<Acceso> accesos) {
		this.accesos = accesos;
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
	public List<Inconveniente> getInconvenientes() {
		return inconvenientes;
	}
	public void setInconvenientes(List<Inconveniente> inconvenientes) {
		this.inconvenientes = inconvenientes;
	}
	public TipoProyecto getTipoProyecto() {
		return tipoProyecto;
	}
	public void setTipoProyecto(TipoProyecto tipoProyecto) {
		this.tipoProyecto = tipoProyecto;
	}
	public EstadoAvance getEstadoAvance() {
		return estadoAvance;
	}
	public void setEstadoAvance(EstadoAvance estadoAvance) {
		this.estadoAvance = estadoAvance;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<AsignacionMaquinaria> getAsignacionMaquinarias() {
		return asignacionMaquinarias;
	}
	public void setAsignacionMaquinarias(List<AsignacionMaquinaria> asignacionMaquinarias) {
		this.asignacionMaquinarias = asignacionMaquinarias;
	}
	public List<AsignacionEmpleado> getAsignacionEmpleado() {
		return asignacionEmpleado;
	}
	public void setAsignacionEmpleado(List<AsignacionEmpleado> asignacionEmpleado) {
		this.asignacionEmpleado = asignacionEmpleado;
	}
	public List<AsignacionMateriaPrima> getAsignacionMateriaPrimas() {
		return asignacionMateriaPrimas;
	}
	public void setAsignacionMateriaPrimas(List<AsignacionMateriaPrima> asignacionMateriaPrimas) {
		this.asignacionMateriaPrimas = asignacionMateriaPrimas;
	}
	public Proyecto(List<Acceso> accesos, String nombre, double latitud, double longitud, double porcentajeAvance,
			LocalDateTime inicio, LocalDateTime fin, List<Inconveniente> inconvenientes, TipoProyecto tipoProyecto,
			EstadoAvance estadoAvance, Cliente cliente, List<AsignacionMaquinaria> asignacionMaquinarias,
			List<AsignacionEmpleado> asignacionEmpleado, List<AsignacionMateriaPrima> asignacionMateriaPrimas) {
		super();
		this.accesos = accesos;
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.porcentajeAvance = porcentajeAvance;
		this.inicio = inicio;
		this.fin = fin;
		this.inconvenientes = inconvenientes;
		this.tipoProyecto = tipoProyecto;
		this.estadoAvance = estadoAvance;
		this.cliente = cliente;
		this.asignacionMaquinarias = asignacionMaquinarias;
		this.asignacionEmpleado = asignacionEmpleado;
		this.asignacionMateriaPrimas = asignacionMateriaPrimas;
	}
	public Proyecto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
