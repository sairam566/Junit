package com.tsr.pro;

import java.util.List;

public class BillingManager {
	
	public double generate(List<Product> products,CreditCard card) throws IllegalAccessException {
		
		double amount = 0.0;
		if(products!=null && products.isEmpty()) {
			throw new IllegalAccessException("Product List is empty");
		}
		if(card.getCardType().equals("MASTER")) {
			throw new IllegalArgumentException("Gate way not supported");
		}
		for (Product product : products) {
			amount += product.getQuantity() * product.getUnitPrice();
		}
		return amount;
	}
}
