package DependsOnAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass10 {
	public static void main(String args[])
	{
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring12.xml");
		ClassC cc=(ClassC) ap.getBean("C");
		
	}

}
