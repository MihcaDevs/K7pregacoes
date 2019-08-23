package com.acosta.k7pregacoes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acosta.k7pregacoes.domain.Pregador;
import com.acosta.k7pregacoes.repositories.PregadorRepository;

@Service
public class PregadorService {
	
	@Autowired
	private PregadorRepository repo;
	
	public Pregador buscar(Integer id) {
		Optional<Pregador> obj = repo.findById(id);
		return obj.orElse(null);
		
	}

}
