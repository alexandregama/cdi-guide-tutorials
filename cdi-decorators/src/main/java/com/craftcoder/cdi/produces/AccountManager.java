package com.craftcoder.cdi.produces;

import java.math.BigDecimal;

import javax.inject.Inject;

public class AccountManager {

	@Inject
	private Account account;

	public void withdrawAmount() {
		account.withdraw(BigDecimal.TEN);
	}

}
