
public class Money {
	protected double amount;
	
	
	public boolean equals(Object object){
		boolean toReturn = false;
		if( object != null && object instanceof Money ){
			Money money = (Money)object;
			toReturn = (money.amount == this.amount && getClass().equals(money.getClass()));
		}
		
		return toReturn;
	}
}
