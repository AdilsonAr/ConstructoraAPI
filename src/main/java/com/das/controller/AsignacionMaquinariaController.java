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

import com.das.dto.AsignacionMaquinariaDto;
import com.das.dto.ResponseAsignacionMaquinariaDto;
import com.das.model.AsignacionMaquinaria;
import com.das.model.Maquinaria;
import com.das.model.Proyecto;
import com.das.service.AsignacionMaquinariaService;

@RestController
@RequestMapping("/asignacion_maquinaria")
public class AsignacionMaquinariaController {
	@Autowired
	private AsignacionMaquinariaService service;
	@GetMapping("/readAll")
	public ResponseEntity<?> readAll(){
		List<ResponseAsignacionMaquinariaDto> dtos=new ArrayList<ResponseAsignacionMaquinariaDto>();
		(service.readAll()).forEach(x->dtos.add(ResponseAsignacionMaquinariaDto.toDto(x)));
		return  new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/read_maquinaria")
	public ResponseEntity<?> read_maquinaria(@RequestParam long id){
		List<ResponseAsignacionMaquinariaDto> dtos=new ArrayList<ResponseAsignacionMaquinariaDto>();
		Maquinaria m=new Maquinaria();
		m.setIdMaquinaria(id);
		(service.readMaquinaria(m)).forEach(x->dtos.add(ResponseAsignacionMaquinariaDto.toDto(x)));
		return  new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/read_proyecto")
	public ResponseEntity<?> read_proyecto(@RequestParam long id){
		List<ResponseAsignacionMaquinariaDto> dtos=new ArrayList<ResponseAsignacionMaquinariaDto>();
		Proyecto p=new Proyecto();
		p.setIdProyecto(id);
		(service.readProyecto(p)).forEach(x->dtos.add(ResponseAsignacionMaquinariaDto.toDto(x)));
		return  new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody AsignacionMaquinariaDto dto){
		service.create(AsignacionMaquinariaDto.toModel(dto));
		return  new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody AsignacionMaquinariaDto dto){
		service.update(AsignacionMaquinariaDto.toModel(dto));
		return  new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam long id){
		AsignacionMaquinaria a=new AsignacionMaquinaria();
		a.setIdAsignacionMaquinaria(id);
		service.delete(a);
		return  new ResponseEntity<>(HttpStatus.OK);
	}
}
