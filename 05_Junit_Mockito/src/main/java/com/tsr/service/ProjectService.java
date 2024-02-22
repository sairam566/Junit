package com.tsr.service;

import com.tsr.dto.Bid;
import com.tsr.dto.ProjectEstimate;

public class ProjectService {
	CostAnalyzerService costAnalyzerService;

	public ProjectService(CostAnalyzerService costAnalyzerService) {
		this.costAnalyzerService = costAnalyzerService;
	}

	public ProjectEstimate getProjectEstimate(double[][] contractorBids) {
		ProjectEstimate projectEstimate = null;
		double totalProjectEstimate = 0;
		Bid lowBid = null;

		projectEstimate = new ProjectEstimate();
		for (int workType = 0; workType < contractorBids.length; workType++) {
			lowBid = costAnalyzerService.getLowestBid(workType, contractorBids[workType]);
			totalProjectEstimate += lowBid.getAmount();
			projectEstimate.getAllotedBids().put(workType, lowBid);
		}
		projectEstimate.setTotalProjectEstimate(totalProjectEstimate);
		return projectEstimate;
	}
}
