package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel;
	private String nom;
	private int nbEtoile;
	@ManyToOne
	private Destination destination;
	@OneToMany(mappedBy = "hotel")
	private List<Reservation> reservations = new ArrayList<>();

	public Hotel() {

	}

	public Hotel(String nom, int nbEtoile) {
		this.nom = nom;
		this.nbEtoile = nbEtoile;
	}

	public Hotel(String nom, int nbEtoile, Destination destination, List<Reservation> reservations) {
		this.nom = nom;
		this.nbEtoile = nbEtoile;
		this.destination = destination;
		this.reservations = reservations;
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

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nom=" + nom + ", nbEtoile=" + nbEtoile + ", destination=" + destination
				+ ", reservations=" + reservations + "]";
	}

}
