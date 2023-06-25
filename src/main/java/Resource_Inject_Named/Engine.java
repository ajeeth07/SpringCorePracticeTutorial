package Resource_Inject_Named;

public class Engine {

	private String engName;

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		System.out.println("setting engine  ");
		this.engName = engName;
	}
	
}
