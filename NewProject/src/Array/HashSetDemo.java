package Array;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	

	public static void main(String args[]) {
		
		//creating a HashSet
		Set<Integer> hashSet= new HashSet<Integer>();
		
		//Using add() for adding Data in HashSet
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		
		System.out.println(hashSet);
		
		// remove() for removing data
		hashSet.remove(4);
		System.out.println(hashSet);
		
		
		
		
	
}


}
