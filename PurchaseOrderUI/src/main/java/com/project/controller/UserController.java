package com.project.controller;

import javax.servlet.http.HttpSession;

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
	public String addRegister(@ModelAttribute User userObj ,BindingResult result )
	{
		//if role
		userService.addUser(userObj);    //method call to service method 
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
	
	
	
	/*@RequestMapping(value="/logIn", method =RequestMethod.POST)
	public String validateUser(@RequestParam String email,@RequestParam String pass)
	{
		String role = loginService.validateUser(email,pass);
		// is_active+role+creadentials match
		//if(role.equals("Buyer") && is_active.equals("Y"))
			{
			
			return "BuyerPage";
			}
		else ifif(role.equals("seller") && is_active.equals("Y")){
			return "seller"
		}
			else {
				
				return "vendor";
			}return null;
		}
	*/
	
	@RequestMapping(value="/logIn", method =RequestMethod.POST)
	public String validateUser(@RequestParam String email ,@RequestParam String pass)
	{
		User uObj = userService.validateUser(email, pass);
		session.setAttribute("uObj",uObj);
		if(uObj==null)
		{
			return "RegisterForm";
		}
		else {
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
