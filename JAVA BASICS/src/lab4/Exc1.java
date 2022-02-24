package lab4;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acc a=new Savings();
		a.balance=2000;
		a.deposite(2000);
		a.setAccNum(1234);
		a.p1.setName("Ram");
		a.p1.setAge(21);
		
		System.out.println(a);
		
		Acc a2=new Savings();
		a2.balance=4000;
		a2.setAccNum(1235);
		a2.p1.setName("Jhon");
		a2.p1.setAge(23);
		System.out.println(a2);
		System.out.println("remaining="+a2.withdraw(2000));
		System.out.println("remaining="+a.withdraw(2000));
		
	}

}
