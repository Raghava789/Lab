package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exc2 e=new Exc2();
		char[] arr= {'b','b','c','a','d','a','a'};
		System.out.println(e.countChars(arr));
		
	}
	public Map<Character,Integer> countChars(char[] arr){
		HashMap<Character,Integer> hashMap=new HashMap<>();
		for(char ch:arr) {
			if(hashMap.containsKey(ch)) {
				hashMap.put(ch, hashMap.get(ch)+1);
			}
			else
				hashMap.put(ch, 1);
		}
	/*	for(Map.Entry entry: hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		return hashMap;

	}

}
