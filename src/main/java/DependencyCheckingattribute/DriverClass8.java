package DependencyCheckingattribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass8 {
public static void main(String[] args) {
ApplicationContext ap1=new ClassPathXmlApplicationContext("Resources/Spring9.xml");	
Student s1=(Student) ap1.getBean("S1");
s1.displayStudDetails();

}
}
