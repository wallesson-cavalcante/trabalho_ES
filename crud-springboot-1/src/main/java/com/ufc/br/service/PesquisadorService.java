package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.br.model.Pesquisador;
import com.ufc.br.repository.PesquisadorRepository;

@Service
public class PesquisadorService {

	@Autowired
	private PesquisadorRepository pesquisadorRepository;
	
	public void cadastrarPesquisador (Pesquisador pesquisador) {
	
		//pesquisador.setSenha(new BCryptPasswordEncoder().encode(pesquisador.getSenha()));
		pesquisadorRepository.save(pesquisador);
	}

	public List<Pesquisador> listarPesquisador() {
		return pesquisadorRepository.findAll();
	}
	
}
