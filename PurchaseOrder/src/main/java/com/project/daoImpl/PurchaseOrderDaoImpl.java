package com.project.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.PurchaseOrderDao;
import com.project.model.PurchaseOrder;

@Repository("purchaseOrderDao")
@Transactional
public class PurchaseOrderDaoImpl implements PurchaseOrderDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean addPO(PurchaseOrder POobj) {
		try {
			Session session=sessionFactory.getCurrentSession();
	
			session.saveOrUpdate(POobj);
			return true;

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
