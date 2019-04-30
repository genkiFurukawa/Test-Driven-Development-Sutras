package money;

public class Bank {

	public Money reduce(Expression source, String to) {
		//	ポリモーフィズム
		return source.reduce(to);
//		if(source instanceof Money) {
//			return ((Money) source).reduce(to);
//		}
//		Sum sum = (Sum) source;
//		return sum.reduce(to);
	}
}
