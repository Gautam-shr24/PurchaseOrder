package com.project.dao;

import com.project.model.Buyer;

public interface BuyerDao {
	
	public boolean addBuyer(Buyer bObj);
	public Buyer validateBuyer(String email ,String password); 

}
