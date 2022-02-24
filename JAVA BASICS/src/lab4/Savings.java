package lab4;

public class Savings extends Acc{
	final double minBalance=500.00;
	public double withdraw(double money) {
		if(money<=(super.balance-minBalance)) {
			return super.withdraw(money);
		}
		System.out.println("Not enough money");
		return balance;
	}
}
