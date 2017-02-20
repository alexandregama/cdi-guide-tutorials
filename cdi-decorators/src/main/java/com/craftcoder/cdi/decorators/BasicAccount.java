package com.craftcoder.cdi.decorators;

import java.math.BigDecimal;

public class BasicAccount implements Account {

	private BigDecimal amount;

	@Override
	public BigDecimal getBalance() {
		return BigDecimal.TEN;
	}

	@Override
	public void withdraw(BigDecimal amount) {
		System.out.println("Withdrawing: " + amount);
		this.amount = amount;
	}

	@Override
	public void deposit(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

}
