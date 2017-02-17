package com.craftcoder.cdi.produces;

public class EmailSender {

	public EmailSender() {
		System.out.println("Constructing the EmailSender");
	}

	public void sendEmailFor(User user) {
		System.out.println("Sending email to: " + user.getEmail());
	}

}
