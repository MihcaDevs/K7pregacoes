package com.acosta.k7pregacoes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acosta.k7pregacoes.domain.Pregador;
import com.acosta.k7pregacoes.repositories.PregadorRepository;

@SpringBootApplication
public class K7pregacoesApplication implements CommandLineRunner {
	
	@Autowired
	private PregadorRepository pregadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(K7pregacoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pregador preg1 = new Pregador(null, "Napoleão Falcão");
		Pregador preg2 = new Pregador(null, "Gilmar Santos");
		
		pregadorRepository.saveAll(Arrays.asList(preg1, preg2));
		
		
	}

}
