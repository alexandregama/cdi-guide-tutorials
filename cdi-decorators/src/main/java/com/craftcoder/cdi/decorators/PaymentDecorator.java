package com.craftcoder.cdi.decorators;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public abstract class PaymentDecorator implements Payment {

	@Inject @Delegate @Any
	private Payment payment;

	@Override
	public void pay(double value) {
		payment.pay(value);
		if (value <= 2000.0) {
			System.out.println("Hey, I'm watching you");
		} else if (value > 2000.0 && value <= 10_000) {
			System.out.println("Hmm, very suspicious, but ok! Go ahead!");
		} else {
			System.out.println("Sorry, you can't do that");
		}
	}

}
