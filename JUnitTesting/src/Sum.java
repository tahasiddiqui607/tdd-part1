
public class Sum implements Expression {

	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}
	public Expression augend;
	public Expression addend;
	
	public Money reduce(Bank bank, String convertTo) {
		double amount  = augend.reduce(bank, convertTo).amount + addend.reduce(bank, convertTo).amount;
		return new Money(amount, convertTo);
	}
	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}
	public Expression times(double multiplier) {
		return new Sum(augend.times(multiplier), addend.times(multiplier));
	}


}
