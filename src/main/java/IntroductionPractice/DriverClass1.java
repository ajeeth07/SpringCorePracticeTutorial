package IntroductionPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import IntroductionPractice.IntroProgram1;

public class DriverClass1 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/IntroSpring.xml");
		IntroProgram1 ip1=(IntroProgram1)ap.getBean("IC");
		ip1.displayMessage();;
	}

}
