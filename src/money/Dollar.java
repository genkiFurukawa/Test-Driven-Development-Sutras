package money;

public class Dollar extends Money {

	Dollar(int amount, String currency){
		super(amount, currency);
	}

	public String currency() {
		return this.currency;
	}

	public Money times(int multiplier) {
		return new Dollar(this.amount * multiplier, "USD");
	}

}
