package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MoneyTest {
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
//		Dollar product = five.times(2);
		assertEquals(Money.dollar(10), five.times(2));
//		product = five.times(3);
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
//		assertTrue(Money.franc(5).equals(Money.franc(5)));
//		assertFalse(Money.franc(5).equals(Money.franc(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

//	サブクラスの仕事を削除し続けた結果FrancとDollarのサブクラスは不要となったため、コメントアウト(ch.11)
//	サブクラス削除前の構造では必要であったが、削除後は冗長になってしまっているため
//	@Test
//	public void testFrancMultiplication() {
//		Money five = Money.franc(5);
//		assertEquals(Money.franc(10), five.times(2));
//		assertEquals(Money.franc(15), five.times(3));
//	}

//	Currency:通貨
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

//	FrancとDollarのサブクラスは不要となったため、コメントアウト(ch.11)
//	@Test
//	public void testDifferentClassEquality() {
//		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
//	}

	@Test
	public void testSimpleAddition() {
//		Money sum = Money.dollar(5).plus(Money.dollar(5));
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		//	bankには式を簡単な形に変形するという意味もある
		Money reduced = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(10), reduced);
	}
}
