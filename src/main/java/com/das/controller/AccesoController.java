package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.AccesoDto;
import com.das.model.Acceso;
import com.das.model.Proyecto;
import com.das.model.Usuario;
import com.das.service.AccesoService;

@RestController
@RequestMapping("/acceso")
public class AccesoController {
	@Autowired
	private AccesoService service;
	
	public ResponseEntity<?> create(@RequestParam long idProyecto,@RequestParam long idUsuario){
		Proyecto p=new Proyecto();
		Usuario u=new Usuario();
		p.setIdProyecto(idProyecto);
		u.setIdUsuario(idUsuario);
		//if no exist
		Acceso acc= service.read(idUsuario, idProyecto);
		if(acc==null) {
			service.create(new Acceso(u, p));
		}		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@GetMapping("/proyecto")
	public ResponseEntity<?> readProyecto(@RequestParam long id){
		List<Acceso> lista= service.readProyecto(id);
		List<AccesoDto> dto=new ArrayList<>();
		lista.forEach(x->dto.add(AccesoDto.toDto(x)));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	@GetMapping("/usuario")
	public ResponseEntity<?> readUsuario(@RequestParam long id){
		List<Acceso> lista= service.readUsuario(id);
		List<AccesoDto> dto=new ArrayList<>();
		lista.forEach(x->dto.add(AccesoDto.toDto(x)));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<?> delete(@RequestParam long id){
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
