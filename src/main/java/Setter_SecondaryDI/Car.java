package Setter_SecondaryDI;

public class Car {
	public Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
public void displayCarDetails()
{
	System.out.println(engine.getCarName());
}
}
