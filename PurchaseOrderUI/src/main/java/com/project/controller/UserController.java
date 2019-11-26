package com.project.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.model.User;
import com.project.service.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	UserService userService;
	

	
//=====open register form========
	
	@RequestMapping(value="/getRegisterForm" , method=RequestMethod.GET)
	public String getRegisterForm(ModelMap map)
	{
		map.addAttribute("userObj",new User());
		return "RegisterForm";
	}
	
//=======register the buyer=========
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String addRegister(@Valid @ModelAttribute User userObj ,BindingResult result )
	{
		if(result.hasErrors()) {
			return "RegisterForm" ;
		}
		else
		{
		userService.addUser(userObj);    //method call to service method 
		return "success";
	}}
	
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
	public String validateUser(@RequestParam String email ,@RequestParam String pass)
	{
		User uObj = userService.validateUser(email, pass);
		
		if(uObj==null)
		{
			return "RegisterForm";
		}
		else {
			
			session.setAttribute("uObj",uObj);    //create session
			if(uObj.getRole().equals("Buyer"))
			{
			
			return "Buyerpage";
			}
			else if(uObj.getRole().equalsIgnoreCase("Vendor")) {
				
				return "VendorPage";
			}
			
			else
			{
				return "Success";
			}
		}
	}
	
}
