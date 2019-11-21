package com.project.servicesImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.dao.LoginDao;
import com.project.model.Login;
import com.project.services.LoginService;


@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;

	public boolean add(Login obj) {
		return loginDao.add(obj);
	}

	public String validateUser(String email, String password) {
		return loginDao.validateUser(email, password);
	}


	

}
