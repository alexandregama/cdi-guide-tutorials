package com.craftcoder.cdi.produces;

public class Checkout {

	@Auditable @Loggable(message = "Finishing Checkout")
	public void finishCheckout() {
		// your awesome business logic here
	}

}
