package com.craftcoder.cdi.produces;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private EmailSender emailSender;

	@Inject
	private MetricCreator metricCreator;

	public void finishCheckout(User user) {
		System.out.println("Finishing Checkout");

		if (user.isOptIn()) { //yes, just Optin users!
			emailSender.sendEmailFor(user);
		}

		metricCreator.createMetric();
	}

}
