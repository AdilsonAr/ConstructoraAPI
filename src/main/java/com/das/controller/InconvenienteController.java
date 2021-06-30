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
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.InconvenienteDto;
import com.das.dto.ItemInconvenienteDto;
import com.das.service.InconvenienteService;

@RestController
@RequestMapping("/inconveniente")
public class InconvenienteController {
	@Autowired
	private InconvenienteService service;
	@GetMapping("/readAll")
	public ResponseEntity<?> readAll(){
		List<ItemInconvenienteDto> dtos=new ArrayList<ItemInconvenienteDto>();
		(service.readAll()).forEach(x->dtos.add(ItemInconvenienteDto.toDto(x)));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody InconvenienteDto dto){
		service.create(InconvenienteDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody InconvenienteDto dto){
		service.update(InconvenienteDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody InconvenienteDto dto){
		service.delete(InconvenienteDto.toModel(dto));
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
