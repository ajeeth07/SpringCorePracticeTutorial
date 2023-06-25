package Constructor_PrimitiveDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass6 {
public static void main(String[] args) {
	ApplicationContext ap1= new ClassPathXmlApplicationContext("Resources/Spring7.xml");
//	Student s1=(Student)ap1.getBean("S1");
//	s1.displayStudDetails();
	
	//Type Attribute Example
	ApplicationContext ap2=new ClassPathXmlApplicationContext("Resources/Spring7.xml");
//	Student1_TypeAttribute st1=(Student1_TypeAttribute)ap2.getBean("ST1");
//	st1.DisplaySt();
	
	//index attribute
	ApplicationContext ap3=new ClassPathXmlApplicationContext("Resources/Spring7.xml");
	Student2_indexAttribute sit1=(Student2_indexAttribute)ap3.getBean("SIT1");
	sit1.DisplaySt2();
	
	
}
}
