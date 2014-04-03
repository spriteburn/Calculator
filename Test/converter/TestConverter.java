package converter;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class TestConverter extends TestCase {

	Converter conv;

	@Before
	public void setUp() {
		conv = new Converter();
	}

	@Test
	public void testKMtoMiles() {
		assertEquals("test KM to miles (10)", 10 * 1.6, conv.KMtoMiles(10));
	}

}
