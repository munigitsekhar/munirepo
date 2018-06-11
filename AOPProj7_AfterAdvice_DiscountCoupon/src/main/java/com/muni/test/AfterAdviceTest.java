package com.muni.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.muni.service.BillAmtGenartorService;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BillAmtGenartorService service=null;
		//Create The IOC Container
		ctx=new ClassPathXmlApplicationContext("com/muni/cfgs/applicationContext.xml");
	    //get The service Bean
		service=ctx.getBean("pfb",BillAmtGenartorService.class);
		//invoke The Method
		System.out.println("Total Bill Amt Is:"+service.BillAmtGenerator(new String[]{"Bat","Balls","gloves","Wicktes","Helmet"}));
	}

}
