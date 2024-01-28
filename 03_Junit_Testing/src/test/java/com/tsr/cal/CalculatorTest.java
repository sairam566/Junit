package com.tsr.cal;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {
	
	// fields used together with @Parameter must be public
	@Parameter(value = 0)
	public int a;
	@Parameter(value = 1)
	public int b;
	@Parameter(value = 2)
	public int expectedSum;
	Calculator calculator = null;
	
	public CalculatorTest() {
		super();
	}

//	public CalculatorTest(int a, int b, int expectedSum) {
//		super();
//		this.a = a;
//		this.b = b;
//		this.expectedSum = expectedSum;
//	}
	
	// creates the test data
	@Parameters
	public static List<Integer[]> getPerameters(){
		return Arrays.asList(new Integer[][] {{10,20,30},{-10,-20,-30},{-10,20,10},{0,0,0}});
	}
	
	@Before
	public void init() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int actualSum = 0;
		actualSum = calculator.add(expectedSum, actualSum);
		Assert.assertEquals(expectedSum, actualSum);
	}
	
	public void cleanUp() {
		calculator = null;
	}
	
}
