package com.craftcoder.cdi.alternatives;

//Without any annotation \o/
public class MoipPayment implements Payment {

	@Override
	public void pay() {
		System.out.println("Paying with Moip");
	}

}
