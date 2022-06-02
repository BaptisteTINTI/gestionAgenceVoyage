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
public class Voyageur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	private String nom;
	private String prenom;
	private int age;
	@OneToMany(mappedBy = "voyageur")
	private List<Reservation> reservations = new ArrayList<>();

	public Voyageur() {
	}

	public Voyageur(Long idVoyageur, String nom, String prenom, int age, List<Reservation> reservations) {
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.reservations = reservations;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", reservations=" + reservations + "]";
	}

}
