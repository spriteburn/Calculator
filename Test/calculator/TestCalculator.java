package calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	Calculator calc;

	public void testAdd() {
		assertEquals("testing add(3,4)", 7, calc.add(3, 4));
	}

	public void testMultiply() {
		assertEquals("testing mult(0,4)", 0, calc.multiply(0, 4));
	}

	public void testSubtract() {
		assertEquals("testing mult(4,4)", 0, calc.subtract(4, 4));
	}

	public void setUp() {
		calc = new Calculator();
	}

}