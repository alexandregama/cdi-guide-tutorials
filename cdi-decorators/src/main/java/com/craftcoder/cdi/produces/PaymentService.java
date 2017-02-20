package com.craftcoder.cdi.produces;

public class PaymentService {

	private Payment payment;

	public void startPayment() {
		payment.pay(100.0);
	}

}
