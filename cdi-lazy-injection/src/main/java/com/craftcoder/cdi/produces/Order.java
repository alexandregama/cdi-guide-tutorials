package com.craftcoder.cdi.produces;

public class Order {

	private double price;
	private Long id;
	private Buyer buyer;

	public Order(Buyer buyer, Long id, double price) {
		this.buyer = buyer;
		this.id = id;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public Long getId() {
		return id;
	}

	public Buyer getBuyer() {
		return buyer;
	}

}
