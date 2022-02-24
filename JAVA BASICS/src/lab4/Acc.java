package lab4;

public class Acc {
	long accNum;
	double balance;
	double withdrawnMoney=0;
	Person p1=new Person();
	public void deposite(double money) {
		balance+=money;
		System.out.println("rs."+money+"credited");
	}
	public double withdraw(double money) {
		withdrawnMoney+=money;
		balance-=money;
		System.out.println("rs."+money+" is debited");
		return balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
