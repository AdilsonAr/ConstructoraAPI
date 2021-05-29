package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.RequestProyectoDto;
import com.das.dto.RequestUpdateProyectoDto;
import com.das.dto.ResponseProyectoDto;
import com.das.model.Acceso;
import com.das.model.Cliente;
import com.das.model.EstadoAvance;
import com.das.model.Proyecto;
import com.das.model.TipoProyecto;
import com.das.service.AccesoService;
import com.das.service.ClienteService;
import com.das.service.EstadoAvanceService;
import com.das.service.ProyectoService;
import com.das.service.TipoProyectoService;
import com.das.service.UsuarioService;

@RestController
@RequestMapping("/proyecto")
public class ProyectoController {
	@Autowired
	ProyectoService service;
	@Autowired
	UsuarioService uservice;
	@Autowired
	AccesoService aservice;
	@Autowired
	ClienteService cservice;
	@Autowired
	TipoProyectoService tservice;
	@Autowired
	EstadoAvanceService avservice;
	
	@GetMapping("/all")
	public ResponseEntity<?> readAll(){
		List<ResponseProyectoDto> dto=new ArrayList<>();
		(service.readAll()).forEach(x->dto.add(ResponseProyectoDto.toDto(x)));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@GetMapping("/mine")
	public ResponseEntity<?> readUsuario(Authentication a){
		long id=uservice.readId(a.getName());
		List<ResponseProyectoDto> dto=new ArrayList<>();
		(aservice.readUsuario(id)).forEach(x->dto.add(ResponseProyectoDto.toDto(x.getProyecto())));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody RequestProyectoDto p, Authentication a) throws Exception{
		Cliente cli=cservice.read(p.getIdCliente());
		TipoProyecto tipo=tservice.read(p.getTipoProyecto());
		EstadoAvance avance=avservice.read("NI");
		if(cli==null) throw new IllegalArgumentException("No se acepta el cliente indicado");
		if(tipo==null) throw new IllegalArgumentException("No se acepta el tipo indicado");		
		Proyecto pro=RequestProyectoDto.toModel(p);
		pro.setCliente(cli);
		pro.setTipoProyecto(tipo);
		pro.setEstadoAvance(avance);
		Proyecto added=service.create(pro);
		aservice.create(new Acceso(uservice.readUsuario(a.getName()), added));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> update(@RequestBody RequestUpdateProyectoDto p, Authentication a) throws Exception{
		Acceso acc=aservice.read(uservice.readId(a.getName()), p.getIdProyecto());
		if(acc!=null) {
			Cliente cli=cservice.read(p.getIdCliente());
			TipoProyecto tipo=tservice.read(p.getTipoProyecto());
			EstadoAvance avance=avservice.read(p.getEstadoAvance());
			if(cli==null) throw new IllegalArgumentException("No se acepta el cliente indicado");
			if(tipo==null) throw new IllegalArgumentException("No se acepta el tipo indicado");
			if(avance==null) throw new IllegalArgumentException("No se acepta el estado de avance indicado");
			Proyecto pro=RequestUpdateProyectoDto.toModel(p);
			pro.setCliente(cli);
			pro.setTipoProyecto(tipo);
			pro.setEstadoAvance(avance);
			service.update(pro);
			return new ResponseEntity<>(HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
		
	}
}
