package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.POItemsDao;
import com.project.dao.ProductDao;
import com.project.dao.PurchaseOrderDao;
import com.project.dao.UserDao;
import com.project.model.POItems;
import com.project.model.Product;
import com.project.model.PurchaseOrder;
import com.project.model.User;
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
	
	//fetch details from database in drop down menu
	@RequestMapping(value = "/getPurchaseOrderForm", method = RequestMethod.GET)
	public String getPOForm(ModelMap map) {
		
		map.addAttribute("productDetails", productService.viewAllProducts());
		return "PurchaseOrder";

	}
	
	
	@Autowired
	HttpSession session;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	PurchaseOrderDao poDao;
	
	@Autowired
	POItemsDao poItemDao;
	
	@ResponseBody
	@RequestMapping(value="/purchaseOrder",method=RequestMethod.POST)
	public String raisePurchaseOrder(@RequestBody List<POItems> poItemsList,ModelMap map) {
		User userObj=(User)session.getAttribute("uObj");
		//System.out.println("i m in");
		PurchaseOrder poObj=new PurchaseOrder();
		poObj.setBuyerObj(userObj);
		poObj.setSellerObj(userDao.gettingSeller());
		poObj.setStatus("Sent to Seller");
		
		//System.out.println("i m in again"+poObj);
		for(POItems obj:poItemsList) {
			obj.setProductObj(productDao.getProductById(obj.getProductId()));
			obj.setPurchaseOrderObj(poObj);
		}
		//System.out.println("i m in agauin.....");
		poObj.setPoItemsObj(poItemsList);
		//System.out.println("hello there"+poObj);
				
		//System.out.println("Purchase Order : "+poObj);
		
		
		poDao.addPO(poObj);
		
		map.addAttribute("msg","Purchase Order has been raised succesfully...");
		return "success";
		
		
	}
	
	@ResponseBody
	@RequestMapping(value="/getProductNameById",method=RequestMethod.GET)
	public Product getProductById(@RequestParam int productId) {
		
		Product pObj=productDao.getProductById(productId);
		return pObj;
	}
	
	/*@RequestMapping(value = "/viewPOS", method = RequestMethod.GET)
	public String viewAllPo(ModelMap map) {
		return "ViewPOtoseller";

	}
	*/

	@RequestMapping(value="viewPOS",method=RequestMethod.GET)
	public String getAllUsers(ModelMap map,@RequestParam(required=false) String msg)
	{
		
		List<PurchaseOrder> list = poDao.viewAllOrders();
		map.addAttribute("list", list);
		session.setAttribute("list",list);
		return "ViewPOtoseller";
		
	}
	
/*	@RequestMapping(value = "/viewlineitems", method = RequestMethod.GET)
	public String viewAllLineItems(ModelMap map) {
		
		
		return "ViewLineItems";

	}*/
	
	@RequestMapping(value = "/viewlineitems", method = RequestMethod.GET)
	public String viewLineItems(@RequestParam int viewId,ModelMap map) {
	
		List<POItems> itemsList = poItemDao.getLineItemsById(viewId);
		map.addAttribute("itemsList",  itemsList);
		System.out.println( itemsList);
		session.setAttribute(" itemsList",  itemsList);
		return "ViewLineItems";
	}	
	
	
	
}
