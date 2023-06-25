package BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//object is created only once during the entire application.... if scope=singleton 
//object will be created based on each user request if scope = prototype
public class DriverClass3 {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring3.xml");
		Car c1=(Car)ap.getBean("C1");
		c1.displayCar();
		Car c2=(Car)ap.getBean("C1");
		c2.displayCar();
		Car c3=(Car)ap.getBean("C1");
		c3.displayCar();
	}

}
