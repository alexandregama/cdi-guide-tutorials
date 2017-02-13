package com.craftcoder.cdi.injectionpoint;

import javax.inject.Inject;

public class Payment {

	@Inject
	private Logger mylogger;

	public void start() {
		mylogger.log("Starting the Payment");
	}

}
