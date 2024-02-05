package com.tsr;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

	Calculator calculator = null;

	public AppTest() {
		super();
		System.out.println("AppTest constructor is called");
	}

	@BeforeAll
	public void startUp() {
		System.out.println("Will be executed First");
	}

	@AfterAll
	public void cleanUp() {
		System.out.println("Will be executed Last");
	}

	@BeforeEach
	public void init() {
		System.out.println("Will be called before every test case Start");
		calculator = new Calculator();
	}

	@AfterEach
	public void destroy() {
		System.out.println("Will be called after every test case End");
	}

	@Test
	public void m1() {
		int add = calculator.add(10, 10);
		System.out.println("From Test case method m1()");
		assertTrue(true);
	}

	@Test
	public void m2() {
		int add = calculator.add(20, 10);
		System.out.println("From Test case method m2()");
		assertTrue(true);
	}

}

