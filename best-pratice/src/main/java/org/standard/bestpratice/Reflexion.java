package org.standard.bestpratice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reflexion {
	
	private static final Logger LOG = LoggerFactory.getLogger(Reflexion.class);
	
	public static void main(String[] args){
		
		try {
			
			// with reflection
			Class<?> c = Class.forName("org.standard.bestpratice.bean.SimpleBean");
			Object simpleBean = c.newInstance();
			Method m = c.getDeclaredMethod("calculateSuccessURL", new Class<?>[0]);
			m.setAccessible(true);
			m.invoke(simpleBean);

		} catch (IllegalAccessException e) {
			LOG.error("error occur during introspection", e);
		} catch (InvocationTargetException e) {
			LOG.error("error occur during introspection", e);
		} catch (ClassNotFoundException e) {
			LOG.error("error occur during introspection", e);
		} catch (InstantiationException e) {
			LOG.error("error occur during introspection", e);
		} catch (SecurityException e) {
			LOG.error("error occur during introspection", e);
		} catch (NoSuchMethodException e) {
			LOG.error("error occur during introspection", e);
		}
	}
}