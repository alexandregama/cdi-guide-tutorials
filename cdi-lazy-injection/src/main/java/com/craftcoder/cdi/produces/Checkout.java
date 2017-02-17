package com.craftcoder.cdi.produces;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

public class Checkout {

	@Inject
	private Instance<EmailSender> emailSender;

	@Inject
	private MetricCreator metricCreator;

	public void finishCheckout(User user) {
		System.out.println("Finishing Checkout");

		if (user.isOptIn()) { //yes, just Optin users!
			emailSender.get().sendEmailFor(user);
		}

		metricCreator.createMetric();
	}

}
