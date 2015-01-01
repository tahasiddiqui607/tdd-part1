import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTests {

	@Test
	public void testMultiplication() {
		Money six = Money.dollar(6);
		assertEquals(Money.dollar(18), six.times(3));
		assertEquals(Money.dollar(24), six.times(4));
	}
	
	@Test
	public void testEquality(){
		assertTrue(Money.dollar(10).equals(Money.dollar(10)));
		assertFalse(Money.dollar(10).equals(Money.dollar(6)));
		assertFalse(Money.rupee(5).equals(Money.dollar(5)));


	}
	
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("PKR", Money.rupee(1).currency());
	}
	
	@Test
	public void testSimpleAddition() {
		Money six = Money.dollar(6);
		Expression sum = six.plus(six);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(12), reduced);
	}
	@Test
	public void testPlusReturnsSum() {Money five= Money.dollar(5);
		Expression result= five.plus(five);
		Sum sum= (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
	
	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), reduced);
	}
	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		Money reduced = bank.reduce(Money.dollar(2), "USD");
		assertEquals(Money.dollar(2), reduced);
	}
	
	@Test
	public void testReduceMoneyDifferentCurrencies() {
		Bank bank = new Bank();
		bank.addRate("PKR","USD", 50);
		Money reduced = bank.reduce(Money.rupee(100), "USD");
		assertEquals(Money.dollar(2), reduced);
	}
}
