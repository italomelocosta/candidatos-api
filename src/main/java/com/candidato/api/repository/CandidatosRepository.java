package com.candidato.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.candidato.api.model.Candidatos;

@Repository
public interface CandidatosRepository extends JpaRepository<Candidatos, Long>{

}
