package com.project.services;

import com.project.model.Buyer;

public interface BuyerService {
	public boolean addBuyer(Buyer bObj);
	public Buyer validateBuyer(String email ,String password); 

}
