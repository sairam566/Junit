package com.tsr;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	Calculator cal = null;

	@Override
	protected void setUp() throws Exception {
		cal = new Calculator();
	}

	@Override
	protected void tearDown() throws Exception {
		cal = null;
	}

	public void testPositiveNumbersAdd() {
		int a = 10;
		int b = 20;
		int expectedSum = 30;
		int actualSum = cal.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}

	public void testNegativeNumbersAdd() {
		int a = -10;
		int b = -20;
		int expectedSum = -30;
		int actualSum = cal.add(a, b);
		Assert.assertEquals(expectedSum, actualSum);
	}
}
