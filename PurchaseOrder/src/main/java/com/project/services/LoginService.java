package com.project.services;

import com.project.model.Login;

public interface LoginService {
	
	public boolean add(Login obj);
	public String validateUser(String email,String password);

}
