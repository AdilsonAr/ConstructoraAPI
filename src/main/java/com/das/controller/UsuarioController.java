package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.SendUsuarioDto;
import com.das.dto.UsuarioDto;
import com.das.model.Usuario;
import com.das.service.MapUsuarioStrategy;
import com.das.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService service;
	@Autowired
	@Qualifier("withCustomRole")
	MapUsuarioStrategy strategy;
	
	@Autowired
	@Qualifier("withReaderRole")
	MapUsuarioStrategy strategy2;
	
	@GetMapping("/all")
	public ResponseEntity<?> readAl(){
		List<Usuario> u=service.readAll();
		List<SendUsuarioDto> dto=new ArrayList<>();
		u.forEach(x->dto.add(SendUsuarioDto.toDto(x)));
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> read(@PathVariable("id") long id){
		Usuario u= service.read(id);
		return new ResponseEntity<>(SendUsuarioDto.toDto(u), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody UsuarioDto u) throws Exception{
		service.create(strategy.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/create_reader")
	public ResponseEntity<?> createReader(@RequestBody UsuarioDto u) throws Exception{
		service.create(strategy2.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody UsuarioDto u) throws Exception{
		service.update(strategy.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestBody UsuarioDto u){
		service.delete(UsuarioDto.toModel(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
