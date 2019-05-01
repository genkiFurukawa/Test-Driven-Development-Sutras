package money;

public class Money implements Expression{

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

	public Expression plus(Money addend) {
//		return new Money(this.amount + addend.amount, addend.currency());
		return new Sum(this, addend);
	}

	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(this.currency, to);
		return new Money(this.amount/ rate, to);

	}

	//	staticメソッドは、newを使わずに呼び出すことができる
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}
}
