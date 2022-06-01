package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel;
	private String nom;
	private int nbEtoile;
	@OneToMany(mappedBy = "hotel")
	private List<Avis> avis = new ArrayList<>();

	public Hotel() {
	}

	public Hotel(String nom, int nbEtoile, List<Avis> avis) {
		this.nom = nom;
		this.nbEtoile = nbEtoile;
		this.avis = avis;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}

	public List<Avis> getAvis() {
		return avis;
	}

	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Hotel [nom=" + nom + ", nbEtoile=" + nbEtoile + ", avis=" + avis + "]";
	}

}
