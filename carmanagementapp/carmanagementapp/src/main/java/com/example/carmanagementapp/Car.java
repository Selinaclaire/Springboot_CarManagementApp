package com.example.carmanagementapp;

import jakarta.persistence.Entity;

@Entity
public class Car {
	
	@jakarta.persistence.Id
	private String carid;
	private String carmodel;
	private String carno;
	private String status;
	
	public Car() {}
	
	public Car(String carid, String carmodel, String carno, String status) {
		super();
		this.carid = carid;
		this.carmodel = carmodel;
		this.carno = carno;
		this.status = status;
	}
	public String getCarid() {
		return carid;
	}
	public void setCarid(String carid) {
		this.carid = carid;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
