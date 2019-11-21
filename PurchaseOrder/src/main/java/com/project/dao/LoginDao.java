package com.project.dao;

import com.project.model.Login;

public interface LoginDao {
	
	public boolean add(Login obj);
	public String validateUser(String email,String password);

}
