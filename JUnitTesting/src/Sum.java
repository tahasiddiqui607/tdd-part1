
public class Sum implements Expression {

	public Sum(Money augend, Money addend) {
		this.augend = augend;
		this.addend = addend;
	}
	public Money augend;
	public Money addend;
	
	public Money reduce(Bank bank, String convertTo) {
		return new Money(augend.amount + addend.amount, convertTo);
	}

}
