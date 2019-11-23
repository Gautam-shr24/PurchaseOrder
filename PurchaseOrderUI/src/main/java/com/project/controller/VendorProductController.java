package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.ProductDao;
import com.project.dao.VendorProductDao;
import com.project.model.Product;
import com.project.model.User;
import com.project.model.VendorProduct;

@Controller
public class VendorProductController {
	
	@Autowired
	VendorProductDao vendorDaoObj;
	
	@Autowired
	HttpSession session;
	
	
	@Autowired
	ProductDao productDaoObj;
	
	//view those products added by the vendor by adding quantity
	@RequestMapping(value = "/viewAllAvailableProducts", method = RequestMethod.GET)
	public String viewAllAvailableProducts(ModelMap map) {
		
		User userObj=(User)session.getAttribute("uObj");     
		int vendorId=userObj.getUserId();                      //fetch id through session 
		
		map.addAttribute("productDetails", vendorDaoObj.getAllProducts(vendorId));    //view products added by vendor getallProducts method in vendouproductdao
				
		return "ViewProduct";      //return view product

	}
	
	//all products available in product table
	@RequestMapping(value = "/viewAllProducts", method = RequestMethod.GET)
	public String viewAllProducts(ModelMap map) {
		
		map.addAttribute("productDetails", productDaoObj.viewAllProducts());   //call to method to view all products
		
		return "ViewAllProducts";    //jsp page showing all products detail
	}
	
	
	
	//get add or update quantity form
	@RequestMapping(value="/updateProductQuantity",method=RequestMethod.GET)
	public String getUpdateQuantityForm(ModelMap map) {
		map.addAttribute("productDetails", productDaoObj.viewAllProducts());   //fetch details in drop down menu
 		return "AddQuantity";    //open form
	}

	
	
	//save or update product
	@RequestMapping(value="/updateProductQuantity",method=RequestMethod.POST)
	public ModelAndView addInVendorproductTable(@RequestParam int pId  , @RequestParam int quantity)
	{
		User userObj=(User)session.getAttribute("uObj");		 //get id from session
		VendorProduct r=vendorDaoObj.checkProductForVendor(userObj.getUserId(), pId);  //check for product already added if already present then update the quantity else add the quantity
		if(r!=null) {
			r.setQuantity(r.getQuantity()+quantity);      //already present then add quantity to existing value
		}
		else {
			r = new VendorProduct();				//else create new object and set values 
			r.setVendorId(userObj.getUserId());
			r.setProductId(pId);
			r.setQuantity(quantity);
		}
		
		vendorDaoObj.add(r);                    //call add method from dao
		
		ModelAndView mv=new ModelAndView("VendorPage");
		mv.addObject("msg","Product Quantity Added Succesfully");
		return mv;
	}

}
