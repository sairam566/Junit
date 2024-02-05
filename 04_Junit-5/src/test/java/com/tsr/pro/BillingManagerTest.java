/**
 * 
 */
package com.tsr.pro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BillingManagerTest {

	BillingManager billManager = null;

	@BeforeEach
	void setUp() throws Exception {
		billManager = new BillingManager();
	}

	@AfterEach
	void tearDown() throws Exception {
		billManager = null;
	}

	@ParameterizedTest
	@MethodSource("generateBillParameters")
	void testBillAmount(List<Product> products, CreditCard creditCard) {
		try {
			double expectedBillAmount = 5.0;
			double actualBillAmount = billManager.generate(products, creditCard);
			assertEquals(expectedBillAmount, actualBillAmount);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public static Stream<Arguments> generateBillParameters() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, 1, 1));
		products.add(new Product(2, 2, 2));
		CreditCard card1 = new CreditCard("566", "564-8954-03266", 8, 2999, 566, "VISA");
		Arguments argument1 = Arguments.arguments(products, card1);
		Arguments argument2 = Arguments.arguments(products, card1);
		return Stream.of(argument1,argument2);
	}
}
