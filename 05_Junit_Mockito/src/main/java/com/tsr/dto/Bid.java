package com.tsr.dto;

import java.util.Objects;

public class Bid {
	private int contractorId;
	private int workTypeId;
	private double amount;

	public Bid() {
		super();
	}

	public Bid(int contractorId, int workTypeId, double amount) {
		this.contractorId = contractorId;
		this.workTypeId = workTypeId;
		this.amount = amount;
	}

	public int getContractorId() {
		return contractorId;
	}

	public void setContractorId(int contractorId) {
		this.contractorId = contractorId;
	}

	public int getWorkTypeId() {
		return workTypeId;
	}

	public void setWorkTypeId(int workTypeId) {
		this.workTypeId = workTypeId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, contractorId, workTypeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bid other = (Bid) obj;
		return Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& contractorId == other.contractorId && workTypeId == other.workTypeId;
	}

	@Override
	public String toString() {
		return "Bid [contractorId=" + contractorId + ", workTypeId=" + workTypeId + ", amount=" + amount + "]";
	}

}
