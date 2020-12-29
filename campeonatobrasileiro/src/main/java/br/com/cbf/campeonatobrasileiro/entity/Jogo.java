package br.com.cbf.campeonatobrasileiro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Jogo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
   
    private Integer golsTime1;
    private Integer golsTime2;
    private Integer publicoPagante;
    
    @ManyToOne
    @JoinColumn(name="time1")
    private time time1;
    @ManyToOne
    @JoinColumn(name="time2")
    private time time2;
}