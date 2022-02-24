package day8;
interface Inft1{
	int sqr(int num);
}
interface Inft2{
	String strCat(String s1,String s2);
}
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inft1 res=(int num) ->(num*num);
		System.out.println(res.sqr(4));
		
		Inft2 res2=(String s1, String s2) ->(s1+s2);
		System.out.println(res2.strCat("Hello", "World"));
	}

}
