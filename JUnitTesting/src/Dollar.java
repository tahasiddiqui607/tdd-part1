
public class Dollar {
	double amount;
	
	public Dollar( double amount ){
		this.amount = amount;
	}
	
	public Dollar times( double multiplier ){
		return new Dollar( this.amount * multiplier );
	}
	
	public boolean equals(Object object){
		boolean toReturn = false;
		if( object != null && object instanceof Dollar ){
			Dollar dollar = (Dollar)object;
			toReturn = (dollar.amount == this.amount);
		}
		
		return toReturn;
	}
}
