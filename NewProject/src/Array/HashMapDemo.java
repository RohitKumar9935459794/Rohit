package Array;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]){
		
		// creating an HashMap
		//Maps has always two arguments
		Map<String,Integer> hashMap= new HashMap<>();
		
		// put() use for adding the element
		
		hashMap.put("a",1);
		hashMap.put("b",2);
		hashMap.put("c",3);
		hashMap.put("d",4);
		
		System.out.println( hashMap);
		
		// size() used for printing the size of the map
		//hashMap.size();
		System.out.println("The size of this map is"+hashMap.size());
		
		//get() is used for printing key
		if(hashMap.containsKey("a")) {
			Integer a= hashMap.get("a");
			System.out.println(" vale of map is "+a);
			}
		
		//For printing all the key use keySet()
		for(String key: hashMap.keySet()) {
			System.out.println(" key:"+key+", value :"+hashMap.get(key));
			
			

	}
	

		//remove() is used for remove 
		hashMap.remove("a", 1);
		System.out.println(hashMap);
	

	
	}

}
		
	





