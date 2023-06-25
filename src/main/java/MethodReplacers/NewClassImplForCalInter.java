package MethodReplacers;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class NewClassImplForCalInter implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method m, Object[] param) throws Throwable {
		
		System.out.println("cal interst in NewClassImplForCalInter by 40%........");
		return obj;
	}
	

}
