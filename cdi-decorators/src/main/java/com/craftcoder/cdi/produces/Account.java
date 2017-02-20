package com.craftcoder.cdi.produces;

import java.math.BigDecimal;

public interface Account {

	public BigDecimal getBalance();

	public void withdraw(BigDecimal amount);

	public void deposit(BigDecimal amount);

}
