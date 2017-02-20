package com.craftcoder.cdi.produces;

public class MoipPayment implements Payment {

	@Override
	public void pay(double value) {
		System.out.println("Paying the value using Moip: " + value);
	}

}
