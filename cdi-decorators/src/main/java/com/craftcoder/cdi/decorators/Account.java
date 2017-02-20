package com.craftcoder.cdi.decorators;

import java.math.BigDecimal;

public interface Account {

	public BigDecimal getBalance();

	public void withdraw(BigDecimal amount);

	public void deposit(BigDecimal amount);

}
