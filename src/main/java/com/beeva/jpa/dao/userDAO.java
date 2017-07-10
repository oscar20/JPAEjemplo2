package com.beeva.jpa.dao;

import com.beeva.jpa.models.User;

public abstract class userDAO {
	//metodos abstractos por definicion
	
	public abstract User save(User user);
	public abstract User getUser(int id);

}
