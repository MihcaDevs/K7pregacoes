package com.acosta.k7pregacoes.resources;

import java.util.Optional;

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
@RequestMapping("/pregador")
public class PregadorResource {
	
	@Autowired
	private PregadorService service;
	
	//Busca lista de pregadores
	
	@GetMapping()
	public Iterable<Pregador> get(){
		return service.getPregadores();
	}	
	
	// Chama o método buscar pregador por Id quando nao acha usa outras classe implementada exception para  tratar o retorno 
	/*
	@GetMapping(value="/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		// Chama o método buscar pregador por Id
		
		Pregador obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	*/
	
	
	//Metodo opcional para buscar pregador pelo id, qdo nao acha retorna null sem implementaçao
	@GetMapping("/{id}")
	public Optional<Pregador> get(@PathVariable("id") Integer id) {
		return service.getPregadorById(id);
	}
	

}
