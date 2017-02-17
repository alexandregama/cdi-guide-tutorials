package com.craftcoder.cdi.produces;

import javax.enterprise.event.Observes;

public class EmailSender {

	public void sendEmailFor(@Observes CheckoutEvent event) {
		Buyer buyer = event.getOrder().getBuyer();

		System.out.println("Sending email to: " + buyer.getEmail());
	}

}
