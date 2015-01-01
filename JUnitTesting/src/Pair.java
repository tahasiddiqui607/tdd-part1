
public class Pair {
	String from;
	String to;
	
	public Pair( String from, String to ){
		this.from = from;
		this.to = to;
	}
	
	@Override
	public boolean equals(Object object){
		boolean toReturn = false;
		if( object instanceof Pair ){
			Pair pair = (Pair) object;
			if(from.equals(pair.from) && to.equals(pair.to)){
				toReturn = true;
			}
		}
		return toReturn;
	}
	
	@Override
	public int hashCode(){
		return 0;
	}
}
