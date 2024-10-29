package Week06Assignment.tests;

import static org.junit.jupiter.api.Assertions.*;

import Week06Assignment.Math;

import org.junit.jupiter.api.Test;

class MathTest {
	
	Math math = new Math();

	@Test
	void testMultiplyReturnCorrectValues() {
		int product = math.multiply(2, 5);
		assertEquals(product, 10);
	}
	
	@Test
	void testDivideReturnsCorrectValues() {
		double result = math.divide(5.0, 2.0);
		assertEquals(2.5, result);
	}
	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	@Test
	void testDivideThrowsExceptionWhenDividingBy0() {
		assertThrows(ArithmeticException.class, () -> math.divide(5, 0));
	}

}
