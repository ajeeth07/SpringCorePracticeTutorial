package DefaultSpringObjectCreationCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//object is created only once during the entire application.....
public class DriverClass2 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring2.xml");
		Car c=(Car)ap.getBean("C1");
		Car c1=(Car)ap.getBean("C1");
		Car c2=(Car)ap.getBean("C1");
		Car c3=(Car)ap.getBean("C1");
		Car c4=(Car)ap.getBean("C1");
		c1.Displaymsg();
		c2.Displaymsg();
		c3.Displaymsg();
		c4.Displaymsg();
	}

}
