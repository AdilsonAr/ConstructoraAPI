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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.ResponseUsuarioDto;
import com.das.dto.RequestUsuarioDto;
import com.das.model.Usuario;
import com.das.service.MapUsuarioStrategy;
import com.das.service.UsuarioService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

//dependency inversion
//la clase controller de usuario(alto nivel) se comunica con los 
//mapper de usuario(bajo nivel) por una abstraccion

@RestController
@CrossOrigin(origins = "http://localhost:3000", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioService service;
	@Autowired
	@Qualifier("withCustomRole")
	private MapUsuarioStrategy strategy;
	
	@Autowired
	@Qualifier("withReaderRole")
	private MapUsuarioStrategy strategy2;
	
	@GetMapping("/all")
	public ResponseEntity<?> readAl(){
		List<Usuario> u=service.readAll();
		List<ResponseUsuarioDto> dto=new ArrayList<>();
		u.forEach(x->dto.add(ResponseUsuarioDto.toDto(x)));
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> read(@PathVariable("id") long id){
		Usuario u= service.read(id);
		return new ResponseEntity<>(ResponseUsuarioDto.toDto(u), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody RequestUsuarioDto u) throws Exception{
		service.create(strategy.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PostMapping("/create_reader")
	public ResponseEntity<?> createReader(@RequestBody RequestUsuarioDto u) throws Exception{
		service.create(strategy2.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody RequestUsuarioDto u) throws Exception{
		service.update(strategy.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam long id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
