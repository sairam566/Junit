package com.tsr.exceptions;

public class ProductNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2130752486793697184L;

	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(String message) {
		super(message);
	}
	
	
}
