package lab3;
import java.util.*;
public class Strings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strings2 mi=new Strings2();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(mi.getImage(str));
	}
	String getImage(String str) {
		StringBuffer sb=new StringBuffer(str);
		return str+"|"+sb.reverse();
	}
}
