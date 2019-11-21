package com.project.servicesImpl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.BuyerDao;
import com.project.dao.LoginDao;
import com.project.model.Buyer;
import com.project.model.Login;
import com.project.services.BuyerService;


@Service("buyerService")
@Transactional
public class BuyerServiceImpl implements BuyerService {
	
	@Autowired
	BuyerDao buyerDao;
	
	@Autowired
	LoginDao loginDao;
	

	public boolean addBuyer(Buyer bObj) {
		bObj.setCreated_date(LocalDate.now());
		bObj.setCreated_by("System");
		bObj.setIs_active("Y");
		
		
  		boolean b=buyerDao.addBuyer(bObj);  //method call to BuyerDaoImpl
  		if(b) {
  			Login obj=new Login();
  			obj.setEmail(bObj.getEmailId());
  			obj.setPassword(bObj.getPassword());
  			obj.setRole("Buyer");
  			loginDao.add(obj);
  			return true;
  		}
  		else {
  			return false;
  		}
		
	}

	

	

}
