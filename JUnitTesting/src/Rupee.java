
public class Rupee extends Money {
	
	public Rupee(double amount) {
		this.amount = amount;
	}

	public Rupee times( double multiplier ){
		return new Rupee(this.amount * multiplier);
	}
	
}
