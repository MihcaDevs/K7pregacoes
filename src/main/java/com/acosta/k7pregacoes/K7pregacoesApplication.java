package com.acosta.k7pregacoes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.acosta.k7pregacoes.domain.Mensagem;
import com.acosta.k7pregacoes.domain.Pregador;
import com.acosta.k7pregacoes.repositories.MensagemRepository;
import com.acosta.k7pregacoes.repositories.PregadorRepository;

@SpringBootApplication
public class K7pregacoesApplication implements CommandLineRunner {
	
	@Autowired
	private PregadorRepository pregadorRepository;
	
	@Autowired
	private MensagemRepository mensagemRepository;

	public static void main(String[] args) {
		SpringApplication.run(K7pregacoesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Pregador preg1 = new Pregador(null, "Gilmar Santos");
		Pregador preg2 = new Pregador(null, "Napoleão Falcão");
		
		Mensagem msg1 = new Mensagem(null, "É já a última hora", "www.pregação.com.br", preg1);
		Mensagem msg2 = new Mensagem(null, "A hora do juizo final", "www.pregação.com.br", preg2);
		Mensagem msg3 = new Mensagem(null, "A salvação conquistada", "www.pregação.com.br", preg1);
		Mensagem msg4 = new Mensagem(null, "Olhai para os montes", "www.pregação.com.br", preg1);
		
		preg1.getMensagens().addAll(Arrays.asList(msg1, msg3, msg4));
		preg2.getMensagens().addAll(Arrays.asList(msg2));
		
		pregadorRepository.saveAll(Arrays.asList(preg1,preg2));
		mensagemRepository.saveAll(Arrays.asList(msg1, msg2, msg3,msg4));
		
		
	}

}
