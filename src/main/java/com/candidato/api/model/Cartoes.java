package com.candidato.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cartoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String numero;
	
	@Column(nullable = false)
	private String nomeCartao;
	
	@Column(nullable = false)
	private String dataVenc;
	
	@Column(nullable = false)
	private String codSeg;
	
	@JoinColumn(name = "candidatos_idCandidatos", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Candidatos candidatosidCandidatos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public String getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(String dataVenc) {
		this.dataVenc = dataVenc;
	}

	public String getCodSeg() {
		return codSeg;
	}

	public void setCodSeg(String codSeg) {
		this.codSeg = codSeg;
	}

	public Candidatos getCandidatosidCandidatos() {
		return candidatosidCandidatos;
	}

	public void setCandidatosidCandidatos(Candidatos candidatosidCandidatos) {
		this.candidatosidCandidatos = candidatosidCandidatos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartoes other = (Cartoes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
