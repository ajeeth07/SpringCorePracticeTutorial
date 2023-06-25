package Resource_Inject_Named;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Qualifier;

public class InjectAutoDI {
	public InjectAutoDI()
	{
		System.out.println("creating InjectAutoDI class object");
	}
	@Inject
	@Qualifier("e2")
	private Engine engine;
	
	public void displayInject()
	{
		System.out.println("iniside displayInject");
		System.out.println(engine.getEngName());
	}

}
