package Setterinjection_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass9 {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("Resources/Spring11.xml");
//	CollectionListSetMapDefaultChildClass csm=(CollectionListSetMapDefaultChildClass)ap.getBean("LSM");
//	csm.displayAllCollectValues();
	CollectionListSetMapOtherChildClassDI clsmo=(CollectionListSetMapOtherChildClassDI) ap.getBean("LSMO");
	clsmo.dispCollections();
}
}

