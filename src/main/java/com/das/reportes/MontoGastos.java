package com.das.reportes;

import java.util.ArrayList;
import java.util.List;

import com.das.configuration.SpringContext;
import com.das.dto.ResponseProyectoDto;
import com.das.model.Proyecto;
import com.das.service.ProyectoService;

public class MontoGastos implements Reporte<ReporteGastos>{
	private ProyectoService pservice =SpringContext.getBean(ProyectoService.class);
	@Override
	public ReporteGastos getReporte() {
		CalculadoraCostos ca=new CalculadoraCostos();
		double costos=0;
		List<Proyecto> p=pservice.readAll();
		List<ResponseProyectoDto> dto=new ArrayList<>();
		for(Proyecto c: p) {
			costos+=ca.getCostos(c);
			dto.add(ResponseProyectoDto.toDto(c));
		}
		ReporteGastos r=new ReporteGastos(dto, costos);
		return r;
	}

}
