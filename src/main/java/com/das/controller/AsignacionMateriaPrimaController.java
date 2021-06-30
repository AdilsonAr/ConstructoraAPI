package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.AsignacionMateriaPrimaDto;
import com.das.dto.ResponseAsignacionMateriaPrimaDto;
import com.das.model.AsignacionMateriaPrima;
import com.das.model.MateriaPrima;
import com.das.model.Proyecto;
import com.das.service.AsignacionMateriaPrimaService;

@RestController
@RequestMapping("/asignacion_materia_prima")
public class AsignacionMateriaPrimaController {
	@Autowired
	private AsignacionMateriaPrimaService service;
	@GetMapping("/readAll")
	public ResponseEntity<?> readAll(){
		List<ResponseAsignacionMateriaPrimaDto> dtos=new ArrayList<ResponseAsignacionMateriaPrimaDto>();
		(service.readAll()).forEach(x->dtos.add(ResponseAsignacionMateriaPrimaDto.toDto(x)));
		return  new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/read_materia_prima")
	public ResponseEntity<?> read_maquinaria(@RequestParam long id){
		List<ResponseAsignacionMateriaPrimaDto> dtos=new ArrayList<ResponseAsignacionMateriaPrimaDto>();
		MateriaPrima m=new MateriaPrima();
		m.setIdMateriaPrima(id);
		(service.readMateriaPrima(m)).forEach(x->dtos.add(ResponseAsignacionMateriaPrimaDto.toDto(x)));
		return  new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/read_proyecto")
	public ResponseEntity<?> read_proyecto(@RequestParam long id){
		List<ResponseAsignacionMateriaPrimaDto> dtos=new ArrayList<ResponseAsignacionMateriaPrimaDto>();
		Proyecto m=new Proyecto();
		m.setIdProyecto(id);
		(service.readProyecto(m)).forEach(x->dtos.add(ResponseAsignacionMateriaPrimaDto.toDto(x)));
		return  new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody AsignacionMateriaPrimaDto dto){
		service.create(AsignacionMateriaPrimaDto.toModel(dto));
		return  new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody AsignacionMateriaPrimaDto dto){
		service.update(AsignacionMateriaPrimaDto.toModel(dto));
		return  new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam long id){
		AsignacionMateriaPrima a=new AsignacionMateriaPrima();
		a.setIdAsignacionMateriaPrima(id);
		service.delete(a);
		return  new ResponseEntity<>(HttpStatus.OK);
	}
}
