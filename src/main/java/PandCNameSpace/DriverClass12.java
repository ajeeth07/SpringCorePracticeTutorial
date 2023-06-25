package PandCNameSpace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass12 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring13.xml");
	Car c1=(Car) ap.getBean("C1");
	c1.displayCarDetails();
	}

}
