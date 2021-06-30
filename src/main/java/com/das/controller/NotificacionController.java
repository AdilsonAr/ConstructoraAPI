package com.das.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.das.dto.NotificacionDto;
import com.das.model.NotificacionNoVista;
import com.das.model.Suscripcion;
import com.das.model.Usuario;
import com.das.service.NotificacionNoVistaService;
import com.das.service.SuscripcionService;
import com.das.service.UsuarioService;
@RestController
@RequestMapping("/notificacion")
public class NotificacionController {
	@Autowired
	SuscripcionService sservice;
	@Autowired
	UsuarioService uservice;
	@Autowired
	private NotificacionNoVistaService noVista;
	
	@GetMapping("/all")
	public ResponseEntity<?> all(Authentication a){
		long id=uservice.readId(a.getName());
		Usuario u=new Usuario();
		u.setIdUsuario(id);
		List<NotificacionDto> dtos=new ArrayList<NotificacionDto>();
		List<Suscripcion> suscripciones=sservice.readUsuario(u);
		suscripciones.forEach(x->x.getCanal().getNotificaciones()
				.forEach(y->{
					NotificacionNoVista nv=noVista.readNotificacion(y);
					if(nv!=null) {
						noVista.delete(nv);
					}
					dtos.add(NotificacionDto.toDto(y));
				}));
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	@GetMapping("/nuevas")
	public ResponseEntity<?> nuevas(Authentication a){
		long id=uservice.readId(a.getName());
		Usuario u=new Usuario();
		u.setIdUsuario(id);
		List<NotificacionDto> dtos=new ArrayList<NotificacionDto>();
		
		noVista.readUsuario(u).forEach(x->dtos.add(NotificacionDto.toDto(x.getNotificacion())));
		
		return new ResponseEntity<>(dtos, HttpStatus.OK);
	}
	
	
}
