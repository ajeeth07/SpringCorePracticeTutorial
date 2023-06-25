package Setterinjection_Primary_SecondaryArray;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass10 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring10.xml");
		Car c1=(Car)ap.getBean("C1");
		c1.display();
	}
}
