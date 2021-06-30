package com.das.reportes;
import java.util.ArrayList;
import java.util.List;

import com.das.dto.ResponseProyectoDto;

public class Terminados extends ProyectosTerminadosDecorator 
implements Reporte<List<ResponseProyectoDto>>{

	@Override
	public List<ResponseProyectoDto> getReporte() {
		List<ResponseProyectoDto> dto=new ArrayList<>();
		(this.getProyectos(inicio, fin)).forEach(x->dto.add(ResponseProyectoDto.toDto(x)));
		return dto;
	}

}
