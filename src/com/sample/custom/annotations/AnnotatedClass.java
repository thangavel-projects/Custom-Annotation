package com.sample.custom.annotations;


public class AnnotatedClass {

	@MyCustomAnnotation(field = "hello")
	public void foo(String param){
		System.out.println("This is "+param);
	}
}
