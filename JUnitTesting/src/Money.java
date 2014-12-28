
public abstract class Money {
	protected double amount;
	
	abstract Money times(double multiplier);

	public static Dollar dollar( double amount ){
		return new Dollar(amount);
	}
	
	public static Rupee rupee(double amount ){
		return new Rupee(amount);
	}
	public boolean equals(Object object){
		boolean toReturn = false;
		if( object != null && object instanceof Money ){
			Money money = (Money)object;
			toReturn = (money.amount == this.amount && getClass().equals(money.getClass()));
		}
		
		return toReturn;
	}
}
