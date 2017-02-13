package com.craftcoder.cdi.injectionpoint;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private Payment payment;
	
	@Inject
	private Logger logger;
	
	public void finishCheckout() {
		logger.log("Finishing Checkout");
		
		payment.start();
	}
	
}
