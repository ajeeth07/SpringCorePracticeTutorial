package BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProgramaticApproach implements InitializingBean, DisposableBean {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("in after property set-programaticApproachClass..."+name);
	}
	//name="Balasubramaniam";
	@Override
	public void destroy() throws Exception {
		name="springgggggg";
		System.out.println("inisde destryy"+name);
	}

}
