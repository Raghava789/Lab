package lab1;
import java.util.*;
public class NumInc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumInc check=new NumInc();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check.checkNumber(n));
	}
	boolean checkNumber(int n) {
		boolean flag=false;
		int digit=n%10;
		n=n/10;
		while(n>0) {
			if(digit<n%10)
			{
				flag=true;
				break;
			}
			digit=n%10;
			n=n/10;
		}
		if(flag==true)
			return false;
		return true;
	}
}
