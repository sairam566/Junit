package com.tsr.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tsr.dto.Bid;
import com.tsr.dto.ProjectEstimate;

@TestInstance(Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class ProjectServiceTest {

	@Mock
	CostAnalyzerService analyzerService;

	@InjectMocks
	ProjectService projectService;

	double[][] contractorEstimates = null;

	@BeforeAll
	void init() {
		// MockitoAnnotations.initMocks(this);
		// analyzerService = Mockito.mock(CostAnalyzerService.class);
		// projectService = new ProjectService(analyzerService);
	}

	@Test
	void getProjectEstimateTest() {

		contractorEstimates = new double[][] { { 10, 20 }, { 20, 1 } };
		when(analyzerService.getLowestBid(0, contractorEstimates[0])).thenReturn(new Bid(0, 0, 10));
		when(analyzerService.getLowestBid(1, contractorEstimates[1])).thenReturn(new Bid(1, 1, 1));
		//when(analyzerService.getLowestBid(2, contractorEstimates[1])).thenReturn(new Bid(2, 2, 20));

		ProjectEstimate expectedEstimate = new ProjectEstimate();
		expectedEstimate.getAllotedBids().put(0, new Bid(0, 0, 10));
		expectedEstimate.getAllotedBids().put(1, new Bid(1, 1, 1));
		expectedEstimate.setTotalProjectEstimate(11);
		ProjectEstimate actualEstimate = projectService.getProjectEstimate(contractorEstimates);
		assertEquals(expectedEstimate, actualEstimate);
	}

	@AfterAll
	void destroy() {
		reset(analyzerService);
	}
}
