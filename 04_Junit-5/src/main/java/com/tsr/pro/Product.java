package com.tsr.pro;

public class Product {
	
	protected int code;
	protected int quantity;
	protected int unitPrice;

	public Product() {
		super();
	}
	public Product(int code, int quantity, int unitPrice) {
		super();
		this.code = code;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	
}
