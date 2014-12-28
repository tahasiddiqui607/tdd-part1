import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTests {

	@Test
	public void testMultiplication() {
		Dollar six = new Dollar(6);
		assertEquals(new Dollar(18), six.times(3));
		assertEquals(new Dollar(24), six.times(4));
	}
	
	@Test
	public void testEquality(){
		assertTrue(new Dollar(10).equals(new Dollar(10)));
		assertFalse(new Dollar(10).equals(new Dollar(6)));
		assertTrue(new Rupee(5).equals(new Rupee(5)));
		assertFalse(new Rupee(5).equals(new Rupee(6)));

	}
	
	@Test
	public void testRupeeMultiplication(){
		Rupee six = new Rupee(6);
		assertEquals(new Rupee(18), six.times(3));
		assertEquals(new Rupee(24), six.times(4));
	}

}
