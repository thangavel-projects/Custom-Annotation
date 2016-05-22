package com.sample.custom.annotations;

public class CustomAnnotationMain {

	public static void main(String[] args) {
		AnnotationParser parser = new AnnotationParser();
		parser.parse(AnnotatedClass.class);
	}
}
