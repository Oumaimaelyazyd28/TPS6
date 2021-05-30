package com.web;

import java.util.List;

public class Etudiant {
	int id;
	String log, pass;
	List<Reservation> rsv;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public List<Reservation> getRsv() {
		return rsv;
	}
	public void setRsv(List<Reservation> rsv) {
		this.rsv = rsv;
	}

}
