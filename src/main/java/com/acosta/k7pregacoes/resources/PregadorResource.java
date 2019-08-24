package com.acosta.k7pregacoes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acosta.k7pregacoes.domain.Pregador;
import com.acosta.k7pregacoes.services.PregadorService;

@RestController
@RequestMapping(value="/pregadores")
public class PregadorResource {
	
	@Autowired
	private PregadorService service;
	
	@GetMapping()
	public Iterable<Pregador> get(){
		return service.getPregadores();
	}	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Pregador obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
