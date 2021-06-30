package com.das.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.RequestUsuarioDto;
import com.das.model.Canal;
import com.das.service.CanalService;
import com.das.service.MapUsuarioStrategy;
import com.das.service.SuscripcionService;
import com.das.service.UsuarioService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	CanalService canalService;
	@Autowired
	SuscripcionService sservice;
	@Autowired
	UsuarioService service;
	@Autowired
	@Qualifier("withCustomRole")
	MapUsuarioStrategy strategy;
	@GetMapping
	public ResponseEntity<?> test(){
		Canal canal=canalService.readNombre("Proyectos");
		System.out.println("en n service: "+canal.getSuscripciones().size());
		return new ResponseEntity<>("hello world",HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody RequestUsuarioDto u) throws Exception{
		service.create(strategy.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
