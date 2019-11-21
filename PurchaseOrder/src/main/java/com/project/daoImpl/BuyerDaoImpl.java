package com.project.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.BuyerDao;
import com.project.model.Buyer;


@Repository("buyerDao")
public class BuyerDaoImpl implements BuyerDao {
	
	@Autowired
	SessionFactory sessionFactory;


	public boolean addBuyer(Buyer bObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(bObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}


	

}
