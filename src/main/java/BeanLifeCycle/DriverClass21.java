package BeanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//Constructor used to inject the DI based on its type for constructor DI
//incase of ambiguity autowire-candidate is used.
public class DriverClass21 {

	public static void main(String[] args) {
//		ConfigurableApplicationContext ap1=new ClassPathXmlApplicationContext("Resources/Spring21.xml");
//		ProgramaticApproach c1=(ProgramaticApproach)ap1.getBean("BLC1");
//		ProgramaticApproach c2=(ProgramaticApproach)ap1.getBean("BLC1");
//		ProgramaticApproach c3=(ProgramaticApproach)ap1.getBean("BLC1");
//		ProgramaticApproach c4=(ProgramaticApproach)ap1.getBean("BLC1");
//		ProgramaticApproach c5=(ProgramaticApproach)ap1.getBean("BLC1");
//		ProgramaticApproach c6=(ProgramaticApproach)ap1.getBean("BLC1");
//		
//		ap1.close();
		
		
//		ConfigurableApplicationContext ap2=new ClassPathXmlApplicationContext("Resources/Spring21.xml");
//		XMLApproach x1=(XMLApproach)ap2.getBean("BLXML");
//		XMLApproach x2=(XMLApproach)ap2.getBean("BLXML");
//		ap2.close();
		ConfigurableApplicationContext ap3=new ClassPathXmlApplicationContext("Resources/Spring21.xml");
		AnnotationApproach apr1=(AnnotationApproach) ap3.getBean("BLAN1");
		ap3.close();
		
		
	}

}
