package com.axelor.one2many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Owner {

	@Id
	@Column(name = "Owner")
	private int owner_id;

	private String owner_name;

	@OneToMany(mappedBy = "Owner")
	private List<Adress> adress;


	public int getOwner_id() {
		return owner_id;
	}


	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getOwner_name() {
		return owner_name;
	}


	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}


	public List<Adress> getAdress() {
		return adress;
	}


	public void setAddress(List<Adress> adress) {
		this.adress = adress;
	}


}