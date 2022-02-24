package lab5;
import java.util.*;
public class NameException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String fname=sc.nextLine();
		String lname=sc.nextLine();
		try {
			if(fname.isEmpty() || lname.isEmpty()) {
				throw new Name("Name should not be blank");
			}
			else
			{
				System.out.println("Success");
			}
		}
		catch(Name a) {
			System.out.println(a);
		}
	}

}
