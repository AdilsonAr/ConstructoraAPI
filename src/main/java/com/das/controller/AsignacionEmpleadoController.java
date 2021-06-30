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

import com.das.dto.AsignacionEmpleadoDto;
import com.das.dto.ResponseAsignacionEmpleadoDto;
import com.das.model.AsignacionEmpleado;
import com.das.model.Empleado;
import com.das.model.Proyecto;
import com.das.service.AsignacionEmpleadoService;

@RestController
@RequestMapping("/asignacion_empleado")
public class AsignacionEmpleadoController {
	@Autowired
	AsignacionEmpleadoService service;
	
	@GetMapping("/readAll")
	public ResponseEntity<?> readAll(){
		List<ResponseAsignacionEmpleadoDto> dtos=new ArrayList<ResponseAsignacionEmpleadoDto>();
		(service.readAll()).forEach(z->dtos.add(ResponseAsignacionEmpleadoDto.toDto(z)));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@GetMapping("/read_proyecto")
	public ResponseEntity<?> readProyecto(@RequestParam long id){
		Proyecto p=new Proyecto();
		p.setIdProyecto(id);
		List<ResponseAsignacionEmpleadoDto> dtos=new ArrayList<ResponseAsignacionEmpleadoDto>();
		(service.readProyecto(p)).forEach(z->dtos.add(ResponseAsignacionEmpleadoDto.toDto(z)));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@GetMapping("/read_empleado")
	public ResponseEntity<?> readEmpleado(@RequestParam long id){
		Empleado e=new Empleado();
		e.setIdEmpleado(id);
		List<ResponseAsignacionEmpleadoDto> dtos=new ArrayList<ResponseAsignacionEmpleadoDto>();
		(service.readEmpleado(e)).forEach(z->dtos.add(ResponseAsignacionEmpleadoDto.toDto(z)));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody AsignacionEmpleadoDto dto){
		service.create(AsignacionEmpleadoDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody AsignacionEmpleadoDto dto){
		service.update(AsignacionEmpleadoDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam long id){
		AsignacionEmpleado a=new AsignacionEmpleado();
		a.setIdAsignacionEmpleado(id);
		service.delete(a);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
