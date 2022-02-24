package lab9;
import java.util.*;
interface Inft{
	void m1(String s);
}
public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inft r=(String s)->{
			for(int i=0;i<s.length();i++) {
				System.out.print(s.charAt(i)+" ");
			}
		};
		r.m1("Capgemini");
	}

}
