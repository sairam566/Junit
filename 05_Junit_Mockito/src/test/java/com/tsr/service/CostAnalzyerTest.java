package com.tsr.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tsr.dto.Bid;

public class CostAnalzyerTest {

	CostAnalyzerService costAnalyzerService;

	@BeforeEach
	public void init() {
		costAnalyzerService = new CostAnalyzerService();
	}

	@Test
	public void testGetLowestBid() {
		double[] workTypeBids = new double[] { 100, 12, 90, 32 };
		Bid expectedBid = new Bid(1, 0, 12);
		Bid actualBid = null;

		actualBid = costAnalyzerService.getLowestBid(0, workTypeBids);
		assertEquals(expectedBid, actualBid);

	}

	@AfterEach
	public void cleanUp() {
		costAnalyzerService = null;
	}

}
