package BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationApproach {
	public AnnotationApproach()
	{
		System.out.println("AnnotaioapproachObject created......");
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setterinjection");
		this.name = name;
	}
	@PostConstruct
	public void initializing() {
		System.out.println("in initalizing method set"+name);
	}
	@PreDestroy
	public void destroying(){
		name="AnnotaionApproach";
		System.out.println("inisde destryy"+name);
	}
}
