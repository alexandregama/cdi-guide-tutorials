package com.craftcoder.cdi.alternatives;

import javax.inject.Inject;

public class PaymentServiceWithAlternatives {

	@Inject
	private Payment payment;

	public void startPayment() {
		payment.pay();
	}

}
