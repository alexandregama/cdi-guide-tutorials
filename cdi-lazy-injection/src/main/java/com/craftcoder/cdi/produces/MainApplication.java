package com.craftcoder.cdi.produces;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

public class MainApplication {

	public static void main(String[] args) {
		try (CDI<Object> container = new Weld().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();

			User user = new User("welcome@craft-coder.com", false); // Now user is not OptIn :(

			checkout.finishCheckout(user);
		}
	}

}
