package com.craftcoder.cdi.injectionpoint;

import javax.inject.Inject;

public class Payment {

	@Inject
	private Logger logger;
	
	public void start() {
		logger.log("Starting the Payment");
	}

}
