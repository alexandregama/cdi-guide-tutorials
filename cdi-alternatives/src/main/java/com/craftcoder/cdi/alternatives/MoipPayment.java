package com.craftcoder.cdi.alternatives;

@Moip
public class MoipPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with Moip");
	}

}
