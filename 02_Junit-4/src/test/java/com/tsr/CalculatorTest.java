package com.tsr;

import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator = null;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@Before
	public void init() {
		System.out.println("Init method called");
		calculator = new Calculator();
	}

	@After
	public void dest() {
		System.out.println("Dest method called");
		calculator = null;
	}

	@Test
	public void positiveNoAdd() {
		int a = 10;
		int b = 20;
		int expectedSum = 30;
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void negativeNoAdd() {
		int a = -10;
		int b = -30;
		int expectedSum = -40;
		int actualSum = calculator.add(a, b);
		assertEquals(expectedSum, actualSum);
	}
}
