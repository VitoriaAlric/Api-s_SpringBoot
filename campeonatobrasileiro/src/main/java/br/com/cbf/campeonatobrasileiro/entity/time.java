package br.com.cbf.campeonatobrasileiro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;


@Entity
@Data

public class time {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer id;
     @Column(length = 20)
     private String nome;
     @Column(length = 4)
     private String sigla;
     @Column(length = 2, name = "estado")
     private String uf;
   
     private String estadio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}
     
     
}