package AutoWire_XmL_AutoDetect;

public class Car {
	private Engine engine;
	public Car()
	{
		
	}
	private Car(Engine engine) {
		System.out.println("inside param cons for autodetect -autowiring");
		this.engine = engine;
	}

	public void dispcarDetails() {
		System.out.println(engine.getCarName());
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		System.out.println("inside param setter for autodetect -autowiring");
		this.engine = engine;
	}

}
