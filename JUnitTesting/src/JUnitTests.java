import static org.junit.Assert.*;

import org.junit.Test;


public class JUnitTests {
	
	class Dollar{
		private double amount;
		
		public Dollar( double amount ){
			this.amount = amount;
		}
		
		public Dollar times( double multiplier ){
			return new Dollar( this.amount * multiplier );
		}
	}

	/*
	 * Chapter 1 and Chapter 2 combine test
	 * **/
	@Test
	public void testMultiplication() {
		Dollar six = new Dollar(6);
		Dollar product = six.times(3);
		assertEquals(18, product.amount, 0);
		
		product = six.times(4);
		assertEquals(24, product.amount, 0);
	}

}
