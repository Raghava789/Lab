package lab9;
interface FacInft{
	void fac(int n);
}
class Exc5{
	public void m1(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
}
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc5 e=new Exc5();
		FacInft r=e::m1;
		r.fac(5);
	}

}
