package AutoWire_XmL_Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Constructor used to inject the DI based on its type for constructor DI
//incase of ambiguity autowire-candidate is used.
public class DriverClass14 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring16.xml");
		Car c1=(Car)ap.getBean("C1");
		c1.dispcarDetails();
	
	}

}
