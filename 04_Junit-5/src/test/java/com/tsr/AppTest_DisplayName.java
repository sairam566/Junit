package com.tsr;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class AppTest_DisplayName {

	Calculator calculator = new Calculator();

	@Test
	public void addPositiveNumbers() {
		int add = calculator.add(10, 10);
		System.out.println("From Test case method m1()");
		assertTrue(true);
	}

	@Test
	public void should_Answer_With_True() {
		System.out.println("From Test case");
		assertTrue(true);
	}

}
