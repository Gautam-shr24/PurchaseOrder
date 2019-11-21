package com.project.test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.DBConfig;
import com.project.model.Buyer;
import com.project.services.BuyerService;
import com.project.services.LoginService;

public class TestClass {

	private static BuyerService buyerService;
	private static LoginService loginService;
	
	
	
	@BeforeClass
	public static void init() {
		
		try {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		buyerService = context.getBean(BuyerService.class,"buyerService");
		loginService = context.getBean(LoginService.class,"loginService");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("I m Init.....");
	}
	
	@Test
	@Ignore
	public void addBuyerTest()
	{
		Buyer bObj = new Buyer();
		bObj.setBuyerName("Karnika");
		bObj.setBuyerAddress("Delhi");
		bObj.setEmailId("k@gmail.com");
		bObj.setCreated_by("System");
		bObj.setCreated_date(LocalDate.now());
		bObj.setPhone_no(3456789012l);
		bObj.setIs_active("Y");
		bObj.setPassword("k123");
	
		
		boolean b = buyerService.addBuyer(bObj);
		
		assertTrue("Problem in adding product",b);
	}
}
