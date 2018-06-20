package com.hackingcode.cdi.produces;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private SpecialLogger logger;

	public void finishCheckout() {
		logger.log("Finishing Checkout");
	}

}
