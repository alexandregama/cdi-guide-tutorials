package com.craftcoder.cdi.produces;

public class MetricCreator {

	public void createMetricFor(Order order) {
		System.out.println("Creating new Metric for OrderId: " + order.getId());
	}

}
