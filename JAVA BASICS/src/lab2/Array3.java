package lab2;
import java.util.*;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 ra=new Array3();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ra.getSorted(n,arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	int[] getSorted(int n,int[] arr) {
		for(int i=0;i<n;i++) {
			String str=Integer.toString(arr[i]);
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			int var=Integer.parseInt(sb.toString());
			arr[i]=var;
		}
		Arrays.sort(arr);
		return arr;
	}

}
