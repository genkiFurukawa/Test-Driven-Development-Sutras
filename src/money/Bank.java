package money;

import java.util.HashMap;
import java.util.Map;


public class Bank {

	private Map<Pair, Integer> rates = new HashMap<>();

	public Money reduce(Expression source, String to) {
		//	ポリモーフィズム
		return source.reduce(this, to);
//		if(source instanceof Money) {
//			return ((Money) source).reduce(to);
//		}
//		Sum sum = (Sum) source;
//		return sum.reduce(to);
	}

	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), rate);
	}

	public int rate(String from, String to) {
		if(from.equals(to)) return 1;
		return rates.get(new Pair(from, to));

	}
}
