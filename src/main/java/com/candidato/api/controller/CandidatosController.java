package com.candidato.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.candidato.api.model.Candidatos;
import com.candidato.api.repository.CandidatosRepository;

@RestController
@RequestMapping("/candidatos")
public class CandidatosController {
	
	@Autowired
	private CandidatosRepository candidatosRepository;
	
	@GetMapping
	private List<Candidatos> lista() {
		return candidatosRepository.findAll();
	}
	
	@GetMapping(path = {"/{id}"})
	private ResponseEntity findById(@PathVariable long id){
	   return candidatosRepository.findById(id)
	           .map(record -> ResponseEntity.ok().body(record))
	           .orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	private Candidatos adicionar (@RequestBody Candidatos candidatos) {
		return candidatosRepository.save(candidatos);
	}
	
	@DeleteMapping
	public void deletar (@RequestBody Candidatos candidatos) {
		candidatosRepository.delete(candidatos);
	}
}
