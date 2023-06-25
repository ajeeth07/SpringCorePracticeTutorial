package StaticPrimarySecondaryDI;

public class Car {
	
	private static Engine engine;

	public static Engine getEngine() {
		return engine;
	}

	public static void setEngine(Engine engine) {
		System.out.println("setter static DI for car class....");
		Car.engine = engine;
	}
	

}
