
public class Dollar {
	double amount;
	
	public Dollar( double amount ){
		this.amount = amount;
	}
	
	public Dollar times( double multiplier ){
		return new Dollar( this.amount * multiplier );
	}
}
