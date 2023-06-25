package StaticPrimarySecondaryDI;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DriverClass20 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring20.xml");
		String a=Car.getEngine().getCarName();
				System.out.println(a);
	} 
}
