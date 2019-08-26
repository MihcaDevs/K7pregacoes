 package com.acosta.k7pregacoes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acosta.k7pregacoes.domain.Pregador;
import com.acosta.k7pregacoes.repositories.PregadorRepository;
import com.acosta.k7pregacoes.services.exceptions.ObjectNotFoundException;

@Service
public class PregadorService {
	
	@Autowired
	private PregadorRepository repo;
	
	
	//Método para buscar pregador por id
	/*
	public Pregador buscar(Integer id) {
		Optional<Pregador> obj = repo.findById(id);		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id +", Tipo: " + Pregador.class.getName()));
		
	}
	*/
	//Busca lista de pregadores para a classe PregadorResource
	
	public Iterable<Pregador> getPregadores() {		
		return repo.findAll();
	}
	
	
	// metodo opcional para buscar pregador pelo id
	public Optional<Pregador> getPregadorById(Integer id) {
		return repo.findById(id);
	}

}

