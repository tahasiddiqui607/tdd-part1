
public abstract class Money {
	protected double amount;
	protected String currency;
	
	abstract Money times(double multiplier);
	abstract String currency();
	
	Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Dollar dollar( double amount ){
		return new Dollar(amount, "USD");
	}
	
	public static Rupee rupee(double amount ){
		return new Rupee(amount, "PKR");
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
