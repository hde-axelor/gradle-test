package com.axelor.one2many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Adress {
	
	@Id
	private int Adress_id;
	
	private String Adress_name;
	
	@ManyToOne
    private Owner owner;

	public int getAdress_id() {
		return Adress_id;
	}

	public void setAdress_id(int adress_id) {
		Adress_id = adress_id;
	}

	public String getAdress_name() {
		return Adress_name;
	}

	public void setAdress_name(String adress_name) {
		Adress_name = adress_name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
}
