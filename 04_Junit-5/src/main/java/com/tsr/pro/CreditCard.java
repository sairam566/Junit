package com.tsr.pro;

public class CreditCard {
	protected String cardNo;
	protected String creditCardNo;
	protected int expiryMonth;
	protected int expiryYear;
	protected int cvv;
	protected String cardType;
	
	public CreditCard() {
		super();
	}

	public CreditCard(String cardNo, String creditCardNo, int expiryMonth, int expiryYear, int cvv, String cardType) {
		super();
		this.cardNo = cardNo;
		this.creditCardNo = creditCardNo;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
		this.cardType = cardType;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + ", creditCardNo=" + creditCardNo + ", expiryMonth=" + expiryMonth
				+ ", expiryYear=" + expiryYear + ", cvv=" + cvv + ", cardType=" + cardType + "]";
	}
	
}
