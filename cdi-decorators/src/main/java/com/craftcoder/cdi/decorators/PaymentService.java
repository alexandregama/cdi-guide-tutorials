package com.craftcoder.cdi.decorators;

import javax.inject.Inject;

public class PaymentService {

	@Inject
	private Payment payment;

	public void startPayment() {
		payment.pay(100.0);
	}

}
