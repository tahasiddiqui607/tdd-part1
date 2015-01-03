
public interface Expression {
	Money reduce(Bank bank, String converTo);
	Expression plus(Expression addend);

}
