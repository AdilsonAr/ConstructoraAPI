package com.das.dto;

import java.time.LocalDateTime;

import com.das.model.Notificacion;

public class NotificacionDto {
	private long idNotificacion;
	private String canal;
	private String conenido;
	private LocalDateTime fecha;
	public long getIdNotificacion() {
		return idNotificacion;
	}
	public void setIdNotificacion(long idNotificacion) {
		this.idNotificacion = idNotificacion;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getConenido() {
		return conenido;
	}
	public void setConenido(String conenido) {
		this.conenido = conenido;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public NotificacionDto(long idNotificacion, String canal, String conenido, LocalDateTime fecha) {
		super();
		this.idNotificacion = idNotificacion;
		this.canal = canal;
		this.conenido = conenido;
		this.fecha = fecha;
	}
	public static NotificacionDto toDto(Notificacion n) {
		return new NotificacionDto(n.getIdNotificacion(), n.getCanal().getNombre()
				, n.getConenido(), n.getDateTime());
	}
}
