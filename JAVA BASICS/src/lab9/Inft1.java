package lab9;
import java.util.*;
interface Inf{
	double pow(int n1, int n2);
}
public class Inft1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inf r=(int n1, int n2)-> Math.pow(n1,  n2);
		System.out.println(r.pow(2, 3));
	}

}
