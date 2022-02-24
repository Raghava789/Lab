package day8;
import java.util.*;
interface Inft{
	void count(ArrayList<Integer> arr);
}
public class ArrLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Size:");
		int n=sc.nextInt();
		System.out.println("elements:");
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		arr.forEach((e)->{System.out.println(e);});
		System.out.println("--------------------------------------");
		arr.forEach((e)->{if(e>50) {System.out.println(e);}});
		System.out.println("----------------------------------------");
		arr.forEach((e)->{if(e%2==0) {System.out.println(e);}});
		System.out.println("-----------------------------------------");
		Inft res=(ArrayList<Integer> a)->{
			int c=0;
			for(Integer i:arr) {
				if(i%2!=0) {
					c=c+1;
				}
			}
			System.out.println(c);
		};
	}

}
