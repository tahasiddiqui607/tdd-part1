
public  class Money implements Expression {
	protected double amount;
	protected String currency;
	
	
	public Expression times( double multiplier ){
		return new Money( this.amount * multiplier, currency );
	}
	
	public Money(double amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public String currency(){
		return currency;
	}

	public static Money dollar( double amount ){
		return new Money(amount, "USD");
	}
	
	public static Money rupee(double amount ){
		return new Money(amount, "PKR");
	}
	public boolean equals(Object object){
		boolean toReturn = false;
		if( object != null && object instanceof Money ){
			Money money = (Money)object;
			toReturn = (money.amount == this.amount && currency().equals(money.currency()));
		}
		
		return toReturn;
	}
	
	public String toString() {
		return amount + " " + currency;
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	
	public Money reduce(Bank bank, String to){
		double rate = bank.rate(currency, to);
		return new Money(amount/rate, to);
	}

	

}
