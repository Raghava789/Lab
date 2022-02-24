package lab4;

public class Cur extends Acc{
	final double overdraftLimit=50000.00;
	public double withdraw(double money) {
		if(super.withdrawnMoney<=overdraftLimit) {
			return super.withdraw(money);
		}
		System.out.println("Limit reached");
		return balance;
	}

}
