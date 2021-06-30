package com.das.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Notificacion;
import com.das.model.NotificacionNoVista;
import com.das.model.Usuario;
import com.das.repository.NotificacionNoVistaRepository;

@Service
public class NotificacionNoVistaService{
	@Autowired
	CanalService canalService;
	@Autowired
	NotificacionNoVistaRepository repo;
	public void create (NotificacionNoVista n) {
		repo.save(n);
	}
	
	private void deleteAll (List<NotificacionNoVista> n) {
		n.forEach(x->repo.delete(x));
	}
	
	public List<NotificacionNoVista> readUsuario(Usuario u){
		List<NotificacionNoVista> l = repo.findByUsuario(u);
		deleteAll(l);
		return l;
	}
	
	public void delete(NotificacionNoVista n) {
		repo.delete(n);
	}
	
	public NotificacionNoVista readNotificacion(Notificacion n) {
		return repo.findByNotificacion(n);
	}
}
