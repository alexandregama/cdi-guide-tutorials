package com.craftcoder.cdi.produces;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private Auditor auditor;

	@Inject
	private MyLogger logger;

	public void finishCheckout() {
		logger.log("Finishing Checkout");

		auditor.audit();
	}

}
