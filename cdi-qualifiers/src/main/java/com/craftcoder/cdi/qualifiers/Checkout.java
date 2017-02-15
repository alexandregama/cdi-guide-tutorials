package com.craftcoder.cdi.qualifiers;

import javax.inject.Inject;

public class Checkout {

	@Inject @DebugMode //debug mode now
	private AwesomeLogger logger;

	public void finishCheckout() {
		logger.log("Finishing Checkout");
	}

}
