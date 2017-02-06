package com.craftcoder.cdi.injectionpoint;

public class Logger {

	public void log(Class<?> clazz, String messageToLog) {
		System.out.println("Class: " + clazz.getSimpleName() + " :: " + messageToLog);
	}

}
