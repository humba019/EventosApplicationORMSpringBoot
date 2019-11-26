package com.eventoapp.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "convidado")
public class Convidado {
	
	@Id
	@NotEmpty
	@Column(name="rg")
	private String rg;

	@NotEmpty
	@Column(name="nome")
	private String nomeCon;
	
	@ManyToOne
	@JoinColumn(name="idevento")
	private Evento evento;

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeCon() {
		return nomeCon;
	}

	public void setNomeCon(String nomeCon) {
		this.nomeCon = nomeCon;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
	
}
