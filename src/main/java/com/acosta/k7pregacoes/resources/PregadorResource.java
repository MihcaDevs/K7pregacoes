package com.acosta.k7pregacoes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acosta.k7pregacoes.domain.Pregador;

@RestController
@RequestMapping(value="/pregadores")
public class PregadorResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Pregador> listar() {
		
		Pregador preg1 = new Pregador(1, "Pr. Napoleão Falcão");
		Pregador preg2 = new Pregador(2, "Pr. Gilmar Santos");
		
		List<Pregador> lista = new ArrayList<>();
		lista.add(preg1);
		lista.add(preg2);
				
				
		return lista;
	}

}
