
public class Dollar extends Money {
	
	
	public Dollar( double amount, String currency ){
		super(amount, currency);
	}
	
	public Money times( double multiplier ){
		return Money.dollar( this.amount * multiplier );
	}
	
	public String currency(){
		return currency;
	}
	
}
