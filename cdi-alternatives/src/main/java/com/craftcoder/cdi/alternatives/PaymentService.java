package com.craftcoder.cdi.alternatives;

import javax.inject.Inject;

public class PaymentService {

	@Inject
	private Payment payment;

	public void startPayment() {
		payment.pay();
	}

}
