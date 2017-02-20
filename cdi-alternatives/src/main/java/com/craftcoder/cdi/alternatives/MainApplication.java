package com.craftcoder.cdi.alternatives;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

public class MainApplication {

	public static void main(String[] args) {
		try (CDI<Object> container = new Weld().initialize()) {
			PaymentServiceWithAlternatives paymentService = container.select(PaymentServiceWithAlternatives.class).get();

			paymentService.startPayment();
		}
	}

}
