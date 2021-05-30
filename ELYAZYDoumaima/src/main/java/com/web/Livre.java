package com.web;

import java.util.List;

public class Livre {
	int idlivre;
	String titre;
	String auteur;
	int idcat;
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	Categorie cat;
	List<Reservation> reserv;
	public int getIdlivre() {
		return idlivre;
	}
	public void setIdlivre(int idlivre) {
		this.idlivre = idlivre;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public Categorie getCat() {
		return cat;
	}
	public void setCat(Categorie cat) {
		this.cat = cat;
	}
	public List<Reservation> getReserv() {
		return reserv;
	}
	public void setReserv(List<Reservation> reserv) {
		this.reserv = reserv;
	}

}
