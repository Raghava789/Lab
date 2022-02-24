package lab1;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power check=new Power();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check.checkNumber(n));
	}
	boolean checkNumber(int n) {
		if(n==0)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}
}
