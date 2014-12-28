
public class Rupee {
	private double amount;
	
	public Rupee(double amount) {
		this.amount = amount;
	}

	public Rupee times( double multiplier ){
		return new Rupee(this.amount * multiplier);
	}
	
	
	public boolean equals(Object object){
		boolean toReturn = false;
		if( object != null && object instanceof Rupee ){
			Rupee rupee = (Rupee)object;
			toReturn = (rupee.amount == this.amount);
		}
		
		return toReturn;
	}
}
