package com.web;

import java.util.List;

public class Categorie {
	int idcat;
	String categorie_name;
	List<Livre> books ;
	public int getIdcat() {
		return idcat;
	}
	public void setIdcat(int idcat) {
		this.idcat = idcat;
	}
	public String getCategorie_name() {
		return categorie_name;
	}
	public void setCategorie_name(String categorie_name) {
		this.categorie_name = categorie_name;
	}
	public List<Livre> getBooks() {
		return books;
	}
	public void setBooks(List<Livre> books) {
		this.books = books;
	}

}
