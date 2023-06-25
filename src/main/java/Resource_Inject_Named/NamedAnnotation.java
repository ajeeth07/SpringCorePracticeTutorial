package Resource_Inject_Named;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class NamedAnnotation {
	@Inject
	@Qualifier("e3")
	private Engine engine;

	public void dispNamed()
	{
		System.out.println("inisde namned class ");
	}

}
