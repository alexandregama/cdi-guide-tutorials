package com.craftcoder.cdi.injectionpoint;

import javax.inject.Inject;

//DeclaredClass 
public class Payment {

	@Inject //Point of Injection? - InjectionPoint
	private Logger mylogger; //member
	
	public void start() {
		mylogger.log("Starting the Payment");
	}

}
