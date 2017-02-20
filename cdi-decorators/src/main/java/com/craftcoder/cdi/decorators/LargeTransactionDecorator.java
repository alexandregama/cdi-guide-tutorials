package com.craftcoder.cdi.decorators;

import java.math.BigDecimal;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Decorator
public abstract class LargeTransactionDecorator implements Account {

	@Inject @Delegate @Any
	private Account account;

	@Override
	public void withdraw(BigDecimal amount) {
		account.withdraw(amount);
		if (amount.equals(new BigDecimal("20"))) {
			System.out.println("Há!");
		} else {
			System.out.println("Nothing to do");
		}
	}

}
