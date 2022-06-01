package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private Date dateReservation;
	private int nbJours;
	@ManyToOne
	@JoinColumn(name = "id_societe")
	private Voyageur voyageur;

	public Reservation() {

	}

	public Reservation(Date dateReservation, int nbJours, Voyageur voyageur) {
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.voyageur = voyageur;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Voyageur getVoyageur() {
		return voyageur;
	}

	public void setVoyageur(Voyageur voyageur) {
		this.voyageur = voyageur;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation + ", nbJours="
				+ nbJours + ", voyageur=" + voyageur + "]";
	}

}
