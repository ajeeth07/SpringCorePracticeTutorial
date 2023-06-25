package Contructor_SecondaryDI;

public class Car {
	private Engine engine;

	
	
	private Car(Engine engine) {
		
		this.engine = engine;
	}



public void displayCarDetails()
{
	System.out.println(engine.getCarName());
}
}
