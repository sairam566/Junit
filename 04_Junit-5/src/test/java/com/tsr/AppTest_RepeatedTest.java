package com.tsr;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class AppTest_RepeatedTest {
	Calculator calculator = null;
	
	@RepeatedTest(value = 5)
	void addPositive(RepetitionInfo info) {
		System.out.println(info.getCurrentRepetition());
		assertTrue(true);
	}
	
	@Test
	void addNeg(TestInfo info) {
		System.out.println(info.getDisplayName());
		assertTrue(true);
	}
}