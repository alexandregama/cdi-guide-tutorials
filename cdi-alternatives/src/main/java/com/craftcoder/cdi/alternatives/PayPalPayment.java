package com.craftcoder.cdi.alternatives;

import javax.enterprise.inject.Alternative;

@Alternative
public class PayPalPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with PayPal");
	}

}
