package com.craftcoder.cdi.produces;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

public class MainApplication {

	public static void main(String[] args) {
		try (CDI<Object> container = new Weld().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();

			Buyer buyer = new Buyer("welcome@craft-coder.com");
			Order order = new Order(buyer, 10L, 80.0);

			checkout.finishCheckout(order);
		}
	}

}
