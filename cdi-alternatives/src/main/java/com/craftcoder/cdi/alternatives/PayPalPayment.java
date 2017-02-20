package com.craftcoder.cdi.alternatives;

@PayPal
public class PayPalPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal");
	}

}
