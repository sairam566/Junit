package com.tsr.service;

import com.tsr.dto.Bid;

public class CostAnalyzerService {
	public Bid getLowestBid(int workTypeId, double[] workTypeBids) {
		Bid bid = null;
		double low = 0;
		int contractId = 0;

		System.out.println("getLowestBid()");
		low = workTypeBids[0];
		for (int i = 1; i < workTypeBids.length; i++) {
			if (low > workTypeBids[i]) {
				low = workTypeBids[i];
				contractId = i;
			}
		}
		bid = new Bid(contractId, workTypeId, low);
		return bid;
	}
}
