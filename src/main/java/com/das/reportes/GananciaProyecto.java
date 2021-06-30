package com.das.reportes;

import java.util.ArrayList;
import java.util.List;

import com.das.dto.ResponseProyectoDto;
import com.das.model.Proyecto;

public class GananciaProyecto implements Reporte<ReporteGanancias>{
	private Proyecto p;
	
	public Proyecto getP() {
		return p;
	}

	public void setP(Proyecto p) {
		this.p = p;
	}

	@Override
	public ReporteGanancias getReporte() {
		ReporteGanancias r = new ReporteGanancias();
		CalculadoraGanancias ca=new GananciasCostoAdapter();
		List<ResponseProyectoDto> dto=new ArrayList<>();
		dto.add(ResponseProyectoDto.toDto(p));
		r.setInicio(p.getInicio());
		r.setFin(p.getFin());
		r.setProyectos(dto);
		r.setGanancias(ca.getGanancias(p));
		
		return r;
	}
	
}