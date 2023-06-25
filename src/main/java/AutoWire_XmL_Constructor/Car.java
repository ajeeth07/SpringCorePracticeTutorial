package AutoWire_XmL_Constructor;

public class Car {
	private Engine engine;

	private Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void dispcarDetails() {
		System.out.println(engine.getCarName());
	}

}
