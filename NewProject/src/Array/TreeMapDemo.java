package Array;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String args[]) {
		
		// creating am tree map
		//Map always contain two types of generic

		TreeMap<String,Integer> treeMap= new TreeMap<>();
		
		// put() used for add values in map
		treeMap.put("Jan", 1);
		treeMap.put("Feb", 2);
		treeMap.put("Mar", 3);
		treeMap.put("Apr", 4);
		treeMap.put("May", 5);
		
		System.out.println(treeMap);
		
		
		
	}

}
