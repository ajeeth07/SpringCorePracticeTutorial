package AutoWire_XML_ByName;

public class Car {
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void dispcarDetails() {
		System.out.println(engine.getCarName());
	}

}
