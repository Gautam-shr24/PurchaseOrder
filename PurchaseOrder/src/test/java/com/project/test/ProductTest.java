package com.project.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.DBConfig;
import com.project.dao.ProductDao;
import com.project.model.Product;
import static org.junit.Assert.assertTrue;


public class ProductTest {
	
	private static ProductDao productDaoObj;
	
	@BeforeClass
	public static void init(){
		System.out.println("I m in init - start");
		//Created the object of Spring container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
	
   	 	productDaoObj=context.getBean(ProductDao.class,"productDao");
   	 	System.out.println("I m in init - end");
	}
	
	@Test
	public void addProductTest(){
		Product p=new Product();
		p.setProductName("Realme X2 Pro");
		p.setProductDes("Realme Flagship phones");
		p.setProductPrice(30000);		
	
		boolean r=productDaoObj.addProduct(p);
		assertTrue("Problem in Adding User", r);
	}
	

}
