package lab6;
import java.util.*;
import java.util.Map.Entry;
public class Exc6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc6 ex=new Exc6();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> hashMap=new HashMap<>();
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			int age=sc.nextInt();
			hashMap.put(id, age);
		}
		System.out.println(ex.votersList(hashMap));

	}
	public List<Integer> votersList(HashMap<Integer,Integer> hashMap){
		List<Integer> list=new ArrayList<Integer>();
		for(Entry<Integer, Integer> entry:hashMap.entrySet()) {
			if(entry.getValue()>18)
			{
				list.add(entry.getValue());
			}
		}
		return list;

	}

}
