package com.craftcoder.cdi.injectionpoint;

public class Logger {

	private Class<?> clazz;

	public Logger(Class<?> clazz) {
		this.clazz = clazz;
	}
	
	public void log(String messageToLog) {
		System.out.println("Class: " + clazz.getSimpleName() + " :: " + messageToLog);
	}

}
