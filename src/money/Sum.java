package money;

public class Sum implements Expression {
	public Expression augend;//被加算数
	public Expression addend;//加算数

	Sum(Expression augend, Expression addend){
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(Bank bank, String to){
		int amount = this.augend.reduce(bank, to).amount
				+ this.addend.reduce(bank, to).amount;
		return new Money(amount, to);
	}

	public Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	public Expression times(int multiplier) {
		return new Sum(this.augend.times(multiplier), this.addend.times(multiplier));
	}
}
