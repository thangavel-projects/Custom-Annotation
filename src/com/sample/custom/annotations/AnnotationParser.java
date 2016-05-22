package com.sample.custom.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationParser {

	public void parse(@SuppressWarnings("rawtypes") Class clazz){
		Method[] declaredMethods = clazz.getDeclaredMethods();
		for (Method method : declaredMethods) {
			if( method.isAnnotationPresent(MyCustomAnnotation.class) ) {
				MyCustomAnnotation myCustom = method.getAnnotation(MyCustomAnnotation.class);
				String field = myCustom.field();
				if("hello".equals(field)){
					try {
						method.invoke(AnnotatedClass.class.newInstance(), field);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
							| InstantiationException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
