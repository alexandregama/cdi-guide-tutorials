package com.craftcoder.cdi.qualifiers;

import javax.enterprise.inject.spi.CDI;

import org.jboss.weld.environment.se.Weld;

public class MainApplication {

	public static void main(String[] args) {
		try (CDI<Object> container = new Weld().initialize()) {
			Checkout checkout = container.select(Checkout.class).get();

			checkout.finishCheckout();
		}
	}

}
