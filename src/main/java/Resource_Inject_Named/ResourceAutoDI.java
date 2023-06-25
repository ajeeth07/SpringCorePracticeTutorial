package Resource_Inject_Named;

import javax.annotation.Resource;

public class ResourceAutoDI {
	public ResourceAutoDI()
	{
		System.out.println("creating RAD class object");
	}
	@Resource
	private Engine engine;
	
	public void display()
	{
		System.out.println("iniside dispMethod");
		System.out.println(engine.getEngName());
	}

}
