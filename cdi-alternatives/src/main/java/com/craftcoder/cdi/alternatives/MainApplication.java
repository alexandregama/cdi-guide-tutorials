package com.craftcoder.cdi.alternatives;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

public class MainApplication {

	public static void main(String[] args) {
		try (CDI<Object> container = new Weld().initialize()) {
			PaymentService paymentService = container.select(PaymentService.class).get();

			paymentService.startPayment();
		}
	}

}
