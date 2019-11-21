package com.project.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.LoginDao;
import com.project.model.Login;


@Repository("loginDao")
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public boolean add(Login obj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(obj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	public String validateUser(String email, String password) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.project.model.Login where email=:email and password=:password");
			query.setParameter("email",email);
			query.setParameter("password",password);
			List<Login> list=query.list();
			if(list.size()!=0) {
				return list.get(0).getRole();
			}
			
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			return null;
	}


	

}
