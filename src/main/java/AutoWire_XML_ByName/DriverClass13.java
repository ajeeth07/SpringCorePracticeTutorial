package AutoWire_XML_ByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//byName used to inject the DI based on its type and name
//Here id should same as the field name, only then this mechanism will work
public class DriverClass13 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring15.xml");
		Car c1=(Car)ap.getBean("C1");
		c1.dispcarDetails();
	
	}

}
