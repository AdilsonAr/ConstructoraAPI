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

import com.das.dto.MateriaPrimaDto;
import com.das.model.MateriaPrima;
import com.das.service.MateriaPrimaService;

@RestController
@RequestMapping("/materia_prima")
public class MateriaPrimaController {
	@Autowired
	private MateriaPrimaService service;
	@GetMapping("/readAll")
	public ResponseEntity<?> readAll(){
		List<MateriaPrimaDto> dtos=new ArrayList<MateriaPrimaDto>();
		(service.readAll()).forEach(x->dtos.add(MateriaPrimaDto.toDto(x)));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody MateriaPrimaDto dto){
		service.create(MateriaPrimaDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody MateriaPrimaDto dto){
		service.update(MateriaPrimaDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	public ResponseEntity<?> delete(@RequestParam long id){
		MateriaPrima m=new MateriaPrima();
		m.setIdMateriaPrima(id);
		service.delete(m);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
