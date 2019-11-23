package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.ProductDao;
import com.project.service.ProductService;

@Controller
public class POController {
	
	@Autowired
	ProductService productService;
	
	/*//get purchase order form
	@RequestMapping(value="/getPurchaseOrderForm",method=RequestMethod.GET)
	public String getPoForm()
	{
		return "PurchaseOrder";
	}*/
	
	//fetch details from database 
	@RequestMapping(value = "/getPurchaseOrderForm", method = RequestMethod.GET)
	public String getPOForm(ModelMap map) {
		
		map.addAttribute("productDetails", productService.viewAllProducts());
		return "PurchaseOrder";

	}
	
	/*@RequestMapping(value="/viewAllProducts",method=RequestMethod.GET)
	public ModelAndView getAllProducts(){
		ModelAndView mv=new ModelAndView("ViewProducts");
		mv.addObject("productDetails",productService.viewAllProducts());
		return mv;
	}
	
*/
}
