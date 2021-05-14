package com.candidato.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.candidato.api.model.Cartoes;

@Repository
public interface CartoesRepository extends JpaRepository<Cartoes, Long>{
	
}
