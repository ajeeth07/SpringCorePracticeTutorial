package Setterinjection_Primary_SecondaryArray;

public class Car {
	private Engine engine[];
	private String carbranchesInIndia[];

	public String[] getCarbranchesInIndia() {
		return carbranchesInIndia;
	}

	public void setCarbranchesInIndia(String[] carbranchesInIndia) {
		this.carbranchesInIndia = carbranchesInIndia;
	}

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	public void display()
	{
		for(int i=0;i<engine.length;i++)
		{
			System.out.println(engine[i].getCarName());
		}
		for(int i=0;i<carbranchesInIndia.length;i++)
		{
			System.out.println(carbranchesInIndia[i]);
		}
	}
	
}
