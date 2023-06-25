package AutoWire_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private Engine engine;
	
	public Car()
	{
		System.out.println("object created ");
	}
	public Engine getEngine() {
		return engine;
	}
	@Autowired
	@Qualifier("e1")
	public void setEngine( Engine engine) {
		System.out.println("setter autowire injection via annotaion");
		this.engine = engine;
	}
	public void dispcarDetails() {
		System.out.println(engine.getCarName());
	}

}
