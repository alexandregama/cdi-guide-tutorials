package com.craftcoder.cdi.alternatives;

public class PayPalPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal");
	}

}
