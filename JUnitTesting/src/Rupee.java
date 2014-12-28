
public class Rupee extends Money {
	
	public Rupee(double amount, String currency) {
		super(amount, currency);
	}

	public Money times( double multiplier ){
		return Money.rupee(this.amount * multiplier);
	}
	
	public String currency(){
		return currency;
	}
}
