package AutoWire_XML_ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//byType used to inject the DI based on its type
//incase of ambiguity autowire-candidate must be used
public class DriverClass12 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring14.xml");
		Car c1=(Car)ap.getBean("C1");
		c1.dispcarDetails();
	
	}

}
