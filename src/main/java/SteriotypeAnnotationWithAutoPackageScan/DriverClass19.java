package SteriotypeAnnotationWithAutoPackageScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DriverClass19 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring19.xml");
		Car c1=(Car)ap.getBean(Car.class);
		c1.dispcarDetails();
	} 
}
