package com.ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufc.br.model.Acessor;
import com.ufc.br.repository.AcessorRepository;

@Service
public class AcessorService {

	@Autowired
	private AcessorRepository acessorRepository;
	
	public void cadastrarAcessor (Acessor acessor) {
	
		acessorRepository.save(acessor);
	}

	public List<Acessor> listarAcessor() {
		return acessorRepository.findAll();
	
	}
	
}
