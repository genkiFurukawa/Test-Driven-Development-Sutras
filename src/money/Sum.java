package money;

public class Sum implements Expression {
	public Money augend;//被加算数
	public Money addend;//加算数

	Sum(Money augend, Money addend){
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(String to){
		int amount = this.augend.amount + this.addend.amount;
		return new Money(amount, to);
	}
}
