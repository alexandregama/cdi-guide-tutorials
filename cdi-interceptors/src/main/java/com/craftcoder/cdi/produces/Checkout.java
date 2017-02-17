package com.craftcoder.cdi.produces;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private MyLogger logger;

	@Auditable
	public void finishCheckout() {
		logger.log("Finishing Checkout");
	}

}
