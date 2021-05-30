package com.web;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestionDao {
	
	public void addCat(String catname)
	{
		DBinteraction.connect();
		DBinteraction.Maj("insert into categorie (categorie_name) values('"+catname+"')");
		DBinteraction.disconnect();
	}
	
	
	public int addEtudiant(String log, String pass)
	{
		DBinteraction.connect();
		String sql="insert into etudiant (login, password) values('"+log+"','"+pass+"')";
		int nb = DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		
		return nb;
	}
	
	
	public void addLivre(String titre, String auteur, int idcat)
	{
		DBinteraction.connect();
		DBinteraction.Maj("insert into livre (titre, auteur, idcategorie) values('"+titre+"', '"+auteur+"', '"+idcat+"')");
		DBinteraction.disconnect();
	}
	
	
	public void addReservation(Date date, Etudiant et, Livre lv)
	{
		DBinteraction.connect();
		DBinteraction.Maj("insert into reservation (date, etudiant, livre) values('"+date+"', '"+et+"', '"+lv+"')");
		DBinteraction.disconnect();
		
	}

	
	public Categorie finCat(int id)
	{
		DBinteraction.connect();
		Categorie c=null;
		ResultSet rs = DBinteraction.select("select * from categorie where id="+id );
		try {
			if(rs.next())
			{
				c=new Categorie();
				c.setIdcat(rs.getInt(1));
				c.setCategorie_name(rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBinteraction.disconnect();
		return c;
	}
	
	
	public List<Categorie> allCat()
	{
		List<Categorie> ls=new ArrayList<Categorie>();
		DBinteraction.connect();
		
		ResultSet rs = DBinteraction.select("select * from categorie");
		try {
			while(rs.next())
			{
				Categorie c;
				c=new Categorie();
				c.setIdcat(rs.getInt(1));
				c.setCategorie_name(rs.getString(2));
				ls.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBinteraction.disconnect();
		return ls;
	}
	
	
	
	public List<Livre> allLivre()
	{
		List<Livre> ls=new ArrayList<Livre>();
		DBinteraction.connect();
		
		ResultSet rs = DBinteraction.select("select * from livre");
		try {
			while(rs.next())
			{
				Livre l;
				l=new Livre();
				Categorie c=new Categorie();
				l.setIdlivre(rs.getInt(1));
				l.setTitre(rs.getString(2));
				l.setAuteur(rs.getString(3));
				l.setIdcat(rs.getInt(4));
				
				ls.add(l);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBinteraction.disconnect();
		return ls;
	}
	
	
	
	public Etudiant authentification(String log, String pass)
	{

		Etudiant et=null;
		DBinteraction.connect();
		ResultSet rs = DBinteraction.select("select * from etudiant where login='"+log+"' and password='"+pass+"'");
		try {
			if(rs.next())
			{
				et=new Etudiant();
				et.setId(rs.getInt(1));
				et.setLog(rs.getString(2));
				et.setPass(rs.getString(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return et;
	}
	
	public int addReservation(int idetu, int idliv)
	{
		DBinteraction.connect();
		String sql="insert into reservation (date, idetu, idliv) values(NOW(),'"+idetu+"','"+idliv+"')";
		int nb = DBinteraction.Maj(sql);
		DBinteraction.disconnect();
		
		return nb;
	}
	
	
	public List<Reservation> allResv()
	{
		List<Reservation> ls=new ArrayList<Reservation>();
		DBinteraction.connect();
		
		ResultSet rs = DBinteraction.select("select * from reservation");
		try {
			while(rs.next())
			{
				Reservation l;
				Reservation r = new Reservation();
				r.setId(rs.getInt(1));
				r.setDate(rs.getDate(2));
				r.setIdetu(rs.getInt(3)); 
				r.setIdliv(rs.getInt(4));
				
				
				ls.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBinteraction.disconnect();
		return ls;
	}

	
}
