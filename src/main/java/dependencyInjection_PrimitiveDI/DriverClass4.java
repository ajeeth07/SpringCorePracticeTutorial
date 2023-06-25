package dependencyInjection_PrimitiveDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass4 {
	public static void main(String args[])
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring4.xml");
		Car c1=(Car) ap.getBean("C1");
		c1.display();
	}

}
