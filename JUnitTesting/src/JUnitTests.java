import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTests {

	/*
	 * Chapter 1 and Chapter 2 combine test
	 * **/
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
	}

}
