package com.tsr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AppTest_parameterized {

	Calculator calculator = null;

	@BeforeEach
	void init() {
		calculator = new Calculator();
	}

	@AfterEach
	void cleanUp() {
		calculator = null;
	}

	@ParameterizedTest
	@CsvSource({ "1,2,3", "10,20,30" })
	void addPositive(int a, int b, int expected) {
		int actualSum = calculator.add(a, b);
		assertEquals(expected, actualSum);
	}

}