package com.hiberApp3.CRUD.Operation.hiber;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity @Table(name="Lappy")
public class Laptop {
	@Id @Column(name="ID")
	int l_id;
	@Column(name="Lname")
	String l_name;
	@Column(name="Lprice")
	String l_price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Laptop(int l_id, String l_name, String l_price) {
		super();
		this.l_id = l_id;
		this.l_name = l_name;
		this.l_price = l_price;
	}


	public int getL_id() {
		return l_id;
	}


	public void setL_id(int l_id) {
		this.l_id = l_id;
	}


	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public String getL_price() {
		return l_price;
	}


	public void setL_price(String l_price) {
		this.l_price = l_price;
	}


	public String toString() {
		return l_id+" "+l_name+" "+l_price;
	}
	

}
