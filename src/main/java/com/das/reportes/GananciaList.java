package com.das.reportes;
import java.util.ArrayList;
import java.util.List;

import com.das.dto.ResponseProyectoDto;
import com.das.model.Proyecto;

public class GananciaList extends ProyectosTerminadosDecorator implements Reporte<ReporteGanancias>{

	@Override
	public ReporteGanancias getReporte() {
		ReporteGanancias r = new ReporteGanancias();
		CalculadoraGanancias ca=new GananciasCostoAdapter();
		double ganancias=0;
		List<Proyecto> p=this.getProyectos(inicio, fin);
		List<ResponseProyectoDto> dto=new ArrayList<>();
		for(Proyecto c: p) {
			ganancias+=ca.getGanancias(c);
			dto.add(ResponseProyectoDto.toDto(c));
		}
		r.setProyectos(dto);
		r.setGanancias(ganancias);
		r.setFin(fin);
		r.setInicio(inicio);
		return r;
	}
	
}
