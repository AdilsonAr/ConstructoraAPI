package com.das.service;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.das.model.Cliente;
import com.das.model.Proyecto;
import com.das.repository.ProyectoRepository;
@Service
public class ProyectoService{
	@Autowired
	NotificacionService noti;
	@Autowired
	ProyectoRepository repo;
	public Proyecto create(Proyecto p) {
		return repo.save(p);
	}
	
	public void update(Proyecto p) {
		Proyecto actual=repo.findById(p.getIdProyecto()).get();
		if(!actual.getEstadoAvance().getEstado().equals(p.getEstadoAvance().getEstado()) 
				&& p.getEstadoAvance().getEstado().equals("PF")) {
			noti.createFinalizacion(p);
		}
		repo.save(p);
	}
	
	public List<Proyecto> readAll(){
		return repo.findAll();
	}
	
	public List<Proyecto> readTerminadosRango(LocalDateTime inicio, LocalDateTime fin){
		return repo.findByFinAfterAndFinBefore(inicio, fin);
	}
	
	public List<Proyecto> readEjecutandoseRango(LocalDateTime inicio, LocalDateTime fin){
		return repo.findByInicioBeforeAndFinAfter(inicio, fin);
	}
	
	public List<Proyecto> readCliente(long id){
		Cliente c=new Cliente();
		return repo.findByCliente(c);
	}
	
	public Proyecto readId(long id) {
		return repo.findById(id).get();
	}
	
}
