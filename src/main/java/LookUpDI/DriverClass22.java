package LookUpDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass22 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring22.xml");

		//InterFace LookUpDI
		//		Car c=(Car)ap.getBean("C");
		//		System.out.println(c.carengName().getEngineName());
		
		//Abstract LookUpDI
//		Truck t=(Truck)ap.getBean("T");
//		System.out.println(t.truckEng().getEngineName());
		
		//Concrete Class DI
		Sample s=(Sample)ap.getBean("S");
		System.out.println(s.sampEngine().getEngineName());
				
		
	}

}
