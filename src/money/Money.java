package money;

abstract public class Money {

	protected int amount;

	abstract Money times(int multiplier);

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && this.getClass() == money.getClass();
	}

	//	staticメソッドは、newを使わずに呼び出すことができる
	public static Dollar dollar(int amount) {
		return new Dollar(amount);
	}

	public static Franc franc(int amount) {
		return new Franc(amount);
	}
}
