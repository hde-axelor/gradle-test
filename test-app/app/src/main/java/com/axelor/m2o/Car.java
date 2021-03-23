package com.axelor.m2o;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;

	private String vehicleName;

	@ManyToOne
	private Owner user;

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Owner getUser() {
		return user;
	}

	public void setUser(Owner user) {
		this.user = user;
	}




}
