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

import com.das.dto.UsuarioDto;
import com.das.service.MapUsuarioStrategy;
import com.das.service.UsuarioService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	UsuarioService service;
	@Autowired
	@Qualifier("withCustomRole")
	MapUsuarioStrategy strategy;
	@GetMapping
	public ResponseEntity<?> test(){
		return new ResponseEntity<>("hello world",HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody UsuarioDto u) throws Exception{
		service.create(strategy.map(u));
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
