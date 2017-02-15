package com.craftcoder.cdi.produces;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class Checkout {

	@Inject
	private Event<CheckoutEvent> event;

	public void finishCheckout(Order order) {
		System.out.println("Finishing Checkout with Id: " + order.getId());

		event.fire(new CheckoutEvent(order));
	}

}
