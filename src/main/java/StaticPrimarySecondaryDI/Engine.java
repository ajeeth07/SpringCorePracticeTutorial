package StaticPrimarySecondaryDI;

public class Engine {
	private static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		System.out.println("setter static DI for Engine class....");
		Engine.carName = carName;
	}
	

	

}
