package calculator;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class TestCalculator extends TestCase {
	Calculator calc;

	@Before
	public void setUp() {
		calc = new Calculator();
	}

	@Test
	public void testAdd() {
		assertEquals("testing add(3,4)", 7, calc.add(3, 4));
	}

	@Test
	public void testMultiply() {
		assertEquals("testing multiply(0,4)", 0, calc.multiply(0, 4));
	}

	@Test
	public void testSubtract() {
		assertEquals("testing subtract(4,4)", 0, calc.subtract(4, 4));
	}

	@Test
	public void testAverage() {
		assertEquals("testing average(34,237)", (34 + 237) / 2,
				calc.average(34, 237));
	}

	@Test
	public void testPower() {
		assertEquals("testing power(5,9)", Math.pow(5, 9), calc.power(5, 9));
	}
	
	@Test
	public void testExponential(){
		assertEquals("testing exp(10)", Math.exp(10),calc.exponential(10));
		
	}

}