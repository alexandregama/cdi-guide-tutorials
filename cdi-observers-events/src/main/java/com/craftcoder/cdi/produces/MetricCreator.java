package com.craftcoder.cdi.produces;

import javax.enterprise.event.Observes;

public class MetricCreator {

	public void createMetricFor(@Observes CheckoutEvent event) {
		Order order = event.getOrder();

		System.out.println("Creating new Metric for OrderId: " + order.getId());
	}

}
