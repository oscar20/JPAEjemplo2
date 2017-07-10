package com.beeva.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity//User sera una entidad de nuestra base
@Table(name="user")
public class User {
	
	@Id//creamos una anotacion para Id para que sea autogenerado
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Valor incremental para ID en nuestra base de datos
	private int id;
	private String name;
	private String address;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
