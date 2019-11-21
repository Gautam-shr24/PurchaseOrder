package com.project.servicesImpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.BuyerDao;
import com.project.model.Buyer;
import com.project.services.BuyerService;


@Service("buyerService")
@Transactional
public class BuyerServiceImpl implements BuyerService {
	
	@Autowired
	BuyerDao buyerDao;

	public boolean addBuyer(Buyer bObj) {
		bObj.setRole_id(1);
		bObj.setCreated_date(LocalDate.now());
		bObj.setCreated_by("System");
		bObj.setIs_active("Y");
  		return buyerDao.addBuyer(bObj);  //method call to BuyerDaoImpl
		
	}

	public Buyer validateBuyer(String email, String password) {
		Buyer buObj = buyerDao.validateBuyer(email, password);
		return buObj;
	}

	

}
