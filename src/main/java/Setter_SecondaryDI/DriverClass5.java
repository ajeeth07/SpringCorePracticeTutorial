package Setter_SecondaryDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass5 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring5.xml");
		Car c1=(Car)ap.getBean("C1");
		c1.displayCarDetails();
	}
}
