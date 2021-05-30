package com.web;

import java.sql.Date;

public class Reservation {
	int id;
	Date date;
	Etudiant et;
	Livre livre;
	int idetu, idliv;
	public int getIdetu() {
		return idetu;
	}
	public void setIdetu(int idetu) {
		this.idetu = idetu;
	}
	public int getIdliv() {
		return idliv;
	}
	public void setIdliv(int idliv) {
		this.idliv = idliv;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Etudiant getEt() {
		return et;
	}
	public void setEt(Etudiant et) {
		this.et = et;
	}
	public Livre getLivre() {
		return livre;
	}
	public void setLivre(Livre livre) {
		this.livre = livre;
	}

}
