package com.project.test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.DBConfig;
import com.project.model.Buyer;
import com.project.services.BuyerService;

public class TestClass {

	private static BuyerService buyerService;
	
	
	
	@BeforeClass
	public static void init() {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		buyerService = context.getBean(BuyerService.class,"buyerService");
		System.out.println("I m Init.....");
	}
	
	@Test
	public void addBuyerTest()
	{
		Buyer bObj = new Buyer();
		bObj.setBuyerName("Karnika");
		bObj.setBuyerAddress("Delhi");
		bObj.setEmailId("k@gmail.com");
		bObj.setPassword("k1234");
		bObj.setCreated_by("System");
		bObj.setCreated_date(LocalDate.now());
		bObj.setPhone_no(1234567890);
		bObj.setRole_id(1);
		bObj.setIs_active("Y");
	
		
		boolean b = buyerService.addBuyer(bObj);
		assertTrue("Problem in adding product",b);
	}
}
