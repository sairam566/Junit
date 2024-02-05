package com.tsr;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class AppTest_ConditionTest {
	Calculator calculator = null;
	
	
	
	@Test
	@EnabledOnJre(value = JRE.JAVA_8)
	void addPositive() {
		calculator = new Calculator();
		int add = calculator.add(10, 20);
		assertEquals(30, add);
	}
}