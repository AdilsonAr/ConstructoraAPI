package com.das.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.das.constants.Money;
import com.das.dto.ClienteDto;
import com.das.dto.ResponseProyectoDto;
import com.das.model.Proyecto;
import com.das.reportes.CalculadoraCostos;
import com.das.reportes.Comprobante;
import com.das.reportes.GananciaList;
import com.das.reportes.GananciaProyecto;
import com.das.reportes.MontoGastos;
import com.das.reportes.ProyectosTerminados;
import com.das.reportes.Terminados;
import com.das.service.ProyectoService;

@RestController
@RequestMapping("/reportes")
public class ReporteController {
	@Autowired
	private ProyectoService pservice;
	
	@GetMapping("/ejecucion")
	public ResponseEntity<?> readEjecucion(@RequestParam LocalDateTime inicio, @RequestParam LocalDateTime fin){
		List<ResponseProyectoDto> dto=new ArrayList<>();
		(pservice.readEjecutandoseRango(inicio, fin)).forEach(x->dto.add(ResponseProyectoDto.toDto(x)));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@GetMapping("/terminados")
	public ResponseEntity<?> readTerminados(@RequestParam LocalDateTime inicio, @RequestParam LocalDateTime fin){
		Terminados terminado= new Terminados();
		terminado.setTerminadosPeriodo(new ProyectosTerminados());
		terminado.setInicio(inicio);
		terminado.setFin(fin);
		return new ResponseEntity<>(terminado.getReporte(), HttpStatus.OK);
	}
	
	@GetMapping("/comprobante")
	public ResponseEntity<?> comprobante(@RequestParam long id){
		Proyecto p=pservice.readId(id);
		CalculadoraCostos cal=new CalculadoraCostos();
		double costoCliente=cal.getCostos(p)*(1+Money.GANANCIAS.getValor());
		Comprobante c=new Comprobante(p.getNombre(), p.getInicio(), p.getFin(), p.getTipoProyecto().getTipo(),
				costoCliente, ClienteDto.toDto(p.getCliente()));
		return new ResponseEntity<>(c, HttpStatus.OK);
	}
	
	@GetMapping("/ganancias_totales")
	public ResponseEntity<?> ganancias_totales(@RequestParam LocalDateTime inicio, @RequestParam LocalDateTime fin){
		GananciaList g= new GananciaList();
		g.setTerminadosPeriodo(new ProyectosTerminados());
		g.setInicio(inicio);
		g.setFin(fin);
		return new ResponseEntity<>(g.getReporte(), HttpStatus.OK);
	}
	
	@GetMapping("/ganancias_proyecto")
	public ResponseEntity<?> ganancias_proyecto(@RequestParam long id){
		Proyecto p=pservice.readId(id);
		GananciaProyecto g= new GananciaProyecto();
		g.setP(p);
		return new ResponseEntity<>(g.getReporte(), HttpStatus.OK);
	}
	
	@GetMapping("/gastos")
	public ResponseEntity<?> gastos(){
		MontoGastos g= new MontoGastos();
		return new ResponseEntity<>(g.getReporte(), HttpStatus.OK);
	}
}
