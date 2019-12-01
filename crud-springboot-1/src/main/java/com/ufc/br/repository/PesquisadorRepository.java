package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.br.model.Pesquisador;

@Repository
public interface PesquisadorRepository extends JpaRepository<Pesquisador, Long>{
}
