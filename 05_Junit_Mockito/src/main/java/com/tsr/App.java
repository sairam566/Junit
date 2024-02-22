package com.tsr;

import com.tsr.dto.ProjectEstimate;
import com.tsr.service.CostAnalyzerService;
import com.tsr.service.ProjectService;

public class App 
{
    public static void main( String[] args )
    {
    	double contractorBids[][] = new double[][] {{10,20,30,4},{40,100,30,40}};
    	
    	CostAnalyzerService analyzerService = new CostAnalyzerService();
    	ProjectService projectService = new ProjectService(analyzerService);
    	ProjectEstimate projectEstimate = projectService.getProjectEstimate(contractorBids);
    	System.out.println(projectEstimate);
    }
}
