package com.craftcoder.cdi.produces;

public class EmailSender {

	public void sendEmailFor(Buyer buyer) {
		System.out.println("Sending email to: " + buyer.getEmail());
	}

}
