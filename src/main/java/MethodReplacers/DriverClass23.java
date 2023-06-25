package MethodReplacers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass23 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring23.xml");
		Banking b=(Banking)ap.getBean("B");
		b.CalInterest();
		
	}

}
