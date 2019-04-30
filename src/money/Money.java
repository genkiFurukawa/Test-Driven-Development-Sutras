package money;

public class Money {

	protected int amount;
	protected String currency;

	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}

	public Money times(int multiplier) {
		return new Money(this.amount * multiplier, this.currency);
	}

	public String currency() {
		return this.currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return this.amount == money.amount && this.currency() == money.currency();
	}

	//	staticメソッドは、newを使わずに呼び出すことができる
	public static Dollar dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Franc franc(int amount) {
		return new Franc(amount, "CHF");
	}
}
