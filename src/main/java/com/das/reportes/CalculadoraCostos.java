package com.das.reportes;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.das.configuration.SpringContext;
import com.das.model.AsignacionEmpleado;
import com.das.model.AsignacionMaquinaria;
import com.das.model.AsignacionMateriaPrima;
import com.das.model.Proyecto;
import com.das.service.AsignacionEmpleadoService;
import com.das.service.AsignacionMaquinariaService;
import com.das.service.AsignacionMateriaPrimaService;

public class CalculadoraCostos {
	private AsignacionEmpleadoService asigeservice=SpringContext.getBean(AsignacionEmpleadoService.class);
	private AsignacionMaquinariaService asigmaqservice=SpringContext.getBean(AsignacionMaquinariaService.class);
	private AsignacionMateriaPrimaService asigmservice=SpringContext.getBean(AsignacionMateriaPrimaService.class);
	
	public double getCostos(Proyecto p) {
		List<AsignacionEmpleado>empleados = asigeservice.readProyecto(p);
		List<AsignacionMaquinaria>maquinaria= asigmaqservice.readProyecto(p);
		List<AsignacionMateriaPrima>materia = asigmservice.readProyecto(p);
		List<Double> costos=new ArrayList<Double>();
		empleados.forEach(x->costos.add(x.getEmpleado().getSueldo()));
		maquinaria.forEach(x->costos.add(x.getMaquinaria().getCostoPromedioMensual()*x.getCantidad()));
		materia.forEach(x->costos.add(x.getMateriaPrima().getCostoPromedio()*x.getCantidad()));
		double total=0;
		for(double c : costos) {
			total+=c;
		}
		Duration d=Duration.between(p.getInicio(), p.getFin());
		return total*(d.toDays()/30);
	}
}
