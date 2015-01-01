import java.util.HashMap;


public class Bank {

	private HashMap<Pair, Double> ratesMap = new HashMap<Pair, Double>();
	public Money reduce(Expression source, String convertTo) {
		return source.reduce(this, convertTo);
	}
	
	public double rate(String from, String to) {
		if( from.equals(to) ){
			return 1;
		}
		return ratesMap.get(new Pair(from, to));
	}

	public void addRate(String from, String to, double rate) {
		ratesMap.put(new Pair(from, to), rate);
		
	}

}
