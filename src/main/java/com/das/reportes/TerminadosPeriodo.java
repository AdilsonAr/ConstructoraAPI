package com.das.reportes;

import java.time.LocalDateTime;
import java.util.List;

import com.das.model.Proyecto;

public interface TerminadosPeriodo {
	public abstract List<Proyecto> getProyectos(LocalDateTime inicio,  LocalDateTime fin);
}
