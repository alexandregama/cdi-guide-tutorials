package com.craftcoder.cdi.produces;

import javax.inject.Inject;

public class Checkout {

	@Inject
	private EmailSender emailSender;

	@Inject
	private MetricCreator metrics;

	public void finishCheckout(Order order) {
		System.out.println("Finishing Checkout with Id: " + order.getId());

		emailSender.sendEmailFor(order.getBuyer());

		metrics.createMetricFor(order);
	}

}
