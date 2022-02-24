package lab6;
import java.util.*;
import java.util.Map.Entry;

public class Exc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc1 ex=new Exc1();
		
		HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			int v=sc.nextInt();
			hashMap.put(k, v);
		}
		System.out.println(ex.getValues(hashMap));
	}
	
	public List<Map.Entry<Integer, Integer>> getValues(HashMap<Integer,Integer> hashMap){
		List<Entry<Integer,Integer>> list=new LinkedList<Entry<Integer,Integer>>(hashMap.entrySet());
		Collections.sort(list,new Comparator<Entry<Integer,Integer>>
		()
		{
			public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2) {
			return o1.getValue().compareTo(o2.getValue());
		}
		});
		return list;
	}

}
