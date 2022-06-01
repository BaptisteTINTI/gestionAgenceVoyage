package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Avis implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idAvis;
	public String commentaire;
	@ManyToOne
	@JoinColumn(name = "id_Societe")
	private Hotel hotel;

}
