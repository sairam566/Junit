package com.tsr.dto;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProjectEstimate {
	private Map<Integer, Bid> allotedBids;
	private double totalProjectEstimate;

	public ProjectEstimate() {
		allotedBids = new HashMap<Integer, Bid>();
	}

	public Map<Integer, Bid> getAllotedBids() {
		return allotedBids;
	}

	public void setAllotedBids(Map<Integer, Bid> allotedBids) {
		this.allotedBids = allotedBids;
	}

	public double getTotalProjectEstimate() {
		return totalProjectEstimate;
	}

	public void setTotalProjectEstimate(double totalProjectEstimate) {
		this.totalProjectEstimate = totalProjectEstimate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(allotedBids, totalProjectEstimate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectEstimate other = (ProjectEstimate) obj;
		return Objects.equals(allotedBids, other.allotedBids)
				&& Double.doubleToLongBits(totalProjectEstimate) == Double.doubleToLongBits(other.totalProjectEstimate);
	}

	@Override
	public String toString() {
		return "ProjectEstimate [allotedBids=" + allotedBids + ", totalProjectEstimate=" + totalProjectEstimate + "]";
	}

}
