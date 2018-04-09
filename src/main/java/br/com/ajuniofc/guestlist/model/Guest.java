package br.com.ajuniofc.guestlist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="guest")
public class Guest {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String telephone;
	
	public Guest() {}
	
	public Guest(String name, String email, String telephone) {
		this.name = name;
		this.email = email;
		this.telephone = telephone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
