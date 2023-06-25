package BeanLifeCycle;

public class XMLApproach {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void initializing() {
		System.out.println("in after property set"+name);
	}
	public void destroying(){
		name="vijayeee";
		System.out.println("inisde destryy"+name);
	}
}
