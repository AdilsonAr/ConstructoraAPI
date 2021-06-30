package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.EmpleadoDto;
import com.das.model.Empleado;
import com.das.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	private EmpleadoService service;
	@GetMapping("/readAll")
	public ResponseEntity<?> readAll(){
		List<EmpleadoDto> dtos=new ArrayList<EmpleadoDto>();
		(service.readAll()).forEach(x->dtos.add(EmpleadoDto.toDto(x)));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody EmpleadoDto e){
		service.create(EmpleadoDto.toModel(e));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody EmpleadoDto e){
		service.update(EmpleadoDto.toModel(e));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> delete(@RequestParam long id){
		Empleado e=new Empleado();
		e.setIdEmpleado(id);
		service.delete(e);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
