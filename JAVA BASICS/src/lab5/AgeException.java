package lab5;
import java.util.*;
public class AgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try {
			if(age<15) {
				throw new Age("Invalid age");
			}
			else
			{
				System.out.println("Valid age");
			}
		}
		catch(Age a) {
			System.out.println(a);
		}
	}

}
