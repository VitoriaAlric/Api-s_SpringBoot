package br.com.cbf.campeonatobrasileiro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "times")

public class time {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
     @Column(length = 20)
     private String nome;
     @Column(length = 4)
     private String sigla;
     @Column(length = 2, name = "estado")
     private String uf;
}