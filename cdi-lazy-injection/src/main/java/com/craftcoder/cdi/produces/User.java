package com.craftcoder.cdi.produces;

public class User {

	private String email;
	private boolean optIn;

	public User(String email, boolean optIn) {
		this.email = email;
		this.optIn = optIn;
	}

	public String getEmail() {
		return this.email;
	}

	public boolean isOptIn() {
		return this.optIn;
	}

}
