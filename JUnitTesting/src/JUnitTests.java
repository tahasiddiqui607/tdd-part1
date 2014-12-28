import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTests {

	@Test
	public void testMultiplication() {
		Dollar six = Money.dollar(6);
		assertEquals(Money.dollar(18), six.times(3));
		assertEquals(Money.dollar(24), six.times(4));
	}
	
	@Test
	public void testEquality(){
		assertTrue(Money.dollar(10).equals(Money.dollar(10)));
		assertFalse(Money.dollar(10).equals(Money.dollar(6)));
		assertTrue(Money.rupee(5).equals(Money.rupee(5)));
		assertFalse(Money.rupee(5).equals(Money.rupee(6)));
		assertFalse(Money.rupee(5).equals(Money.dollar(5)));


	}
	
	@Test
	public void testRupeeMultiplication(){
		Rupee six = Money.rupee(6);
		assertEquals(Money.rupee(18), six.times(3));
		assertEquals(Money.rupee(24), six.times(4));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("PKR", Money.rupee(1).currency());
	}
	
	@Test
	public void testDifferentClassEquality() {
		assertTrue(new Money(10, "PKR").equals(new Rupee(10, "PKR")));
	}


}
