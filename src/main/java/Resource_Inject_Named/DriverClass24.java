package Resource_Inject_Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass24 {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring24.xml");
//		ResourceAutoDI RAD=(ResourceAutoDI)ap.getBean("R");
//		RAD.display();
		
//		InjectAutoDI iad=(InjectAutoDI)ap.getBean("I");
//		iad.displayInject();
		
		NamedAnnotation na=(NamedAnnotation)ap.getBean(NamedAnnotation.class);
		na.dispNamed();
		
		
	}

}
