package money;

public class Dollar {
	public int amount;

	Dollar(int amount){
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		return new Dollar(this.amount * multiplier);
	}
}
