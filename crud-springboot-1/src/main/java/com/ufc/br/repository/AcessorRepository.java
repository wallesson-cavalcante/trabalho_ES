package com.ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ufc.br.model.Acessor;

@Repository
public interface AcessorRepository extends JpaRepository<Acessor, Long>{

}
