package com.craftcoder.cdi.produces;

import static java.math.BigDecimal.TEN;

import java.math.BigDecimal;

import javax.enterprise.inject.Alternative;

@Alternative
public class AdvancedAccount implements Account {

	private BigDecimal amount;

	@Override
	public BigDecimal getBalance() {
		return TEN.add(TEN);
	}

	@Override
	public void withdraw(BigDecimal amount) {
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
