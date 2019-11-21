package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.BuyerDao;
import com.project.model.Buyer;
import com.project.services.BuyerService;

@Controller
public class BuyerController {
	
	
	@Autowired
	BuyerService buyerService;
	
	@Autowired
	BuyerDao buyerDao;
	
//=====open register form========
	
	@RequestMapping(value="/getRegisterForm" , method=RequestMethod.GET)
	public String getProductForm(ModelMap map)
	{
		map.addAttribute("buyerObj",new Buyer());
		return "RegisterForm";
	}
	
//=======register the buyer=========
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String addProduct(@ModelAttribute Buyer bObj )
	{
		buyerService.addBuyer(bObj);    //method call to service method 
		return "success";
	}
	
//=======open login form=========
	
	@RequestMapping(value="/getLoginForm",method=RequestMethod.GET)
	public String getLoginForm()
	{
		return "LoginForm";
	}
	
	
//======login buyer==========
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/logIn", method =RequestMethod.POST)
	public String validateUser(@RequestParam String email,@RequestParam String pass)
	{
		Buyer bObj = buyerService.validateBuyer(email,pass);
		session.setAttribute("bObj",bObj);
		if(bObj==null)
		{
			return "LoginForm";
		}
		else {
			if(bObj.getRole_id()==1)
			{
			
			return "BuyerPage";
			}
			else {
				
				return "Success";
			}
		}
	}
	
	
}
