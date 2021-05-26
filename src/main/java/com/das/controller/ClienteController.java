package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.das.dto.ClienteDto;
import com.das.model.Cliente;
import com.das.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	ClienteService service;
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody ClienteDto c){
		service.create(ClienteDto.toModel(c));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody ClienteDto c){
		service.update(ClienteDto.toModel(c));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam long id){
		Cliente c=new Cliente();
		c.setIdCliente(id);
		service.delete(c);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/all")
	public ResponseEntity<?> readAll(){
		List<Cliente> l1=service.readAll();
		List<ClienteDto> l2=new ArrayList<>();
		l1.forEach(x->l2.add(ClienteDto.toDto(x)));
		return new ResponseEntity<>(l2, HttpStatus.OK);
	}
	
	@GetMapping("/one/{id}")
	public ResponseEntity<?> read(@PathVariable("id") long id){
		return new ResponseEntity<>(ClienteDto.toDto(service.read(id)), HttpStatus.OK);
	}
}
