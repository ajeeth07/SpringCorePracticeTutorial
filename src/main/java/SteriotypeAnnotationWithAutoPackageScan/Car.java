package SteriotypeAnnotationWithAutoPackageScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Car {
	@Autowired
	private Engine engine;
	public Car()
	{
		System.out.println("car object....");
	}
	
	public void dispcarDetails() {
		System.out.println(engine.getCarName());
	}

}
