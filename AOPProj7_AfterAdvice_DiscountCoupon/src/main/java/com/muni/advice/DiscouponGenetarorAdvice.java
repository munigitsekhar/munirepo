package com.muni.advice;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiscouponGenetarorAdvice  implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		int billAmt=(int)returnValue;
		String status=null;
		File file=null;
		Writer writer=null;
		if(billAmt>10000)
			 status ="Discount of 40% in next Purchase";
		 else if(billAmt>8000)
			  status= "Discount of 30% in next Purchase";
		 else if(billAmt>6000)
			  status= "Discount of 20% in next Purchase";
		 else if(billAmt>4000)
			  status="Discount of 10% in next Purchase";
		 else if(billAmt>3000)
			 status="Discount of 5% in next Purchase";	
		 else
			  status= "Discount of 2% in next Purchase";
		//Audit The status into file "f:/DiscountCoupons"
		file=new File("f:/DiscountCoupons");
	    writer=new FileWriter(file);
	    writer.append(status+"\n ");
	    writer.flush();
	    writer.close();
	}

}
