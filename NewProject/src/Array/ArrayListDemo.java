package Array;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void mai(String args[]) {
		// Creating An ArrayList and Its index Size is 5
		ArrayList<Integer> arrayList= new ArrayList<Integer>(5);
		
		//Using add method  For adding integers in array list
		for (int i = 0;i<=5;i++) 
		arrayList.add(1);
		System.out.println(arrayList);
		
		//Using remove() for removing the integer
		arrayList.remove(3);
		System.out.println(arrayList);
		
		// Using size()  to print length of the ArrayList
		for(int i=0; i<arrayList.size(); i++);
		
		System.out.println(arrayList.get(1)+"");
		
		//Using remove () for remove any integer from ArrayList
		arrayList.remove(3);
		System.out.println(arrayList);
		
		
		
			
		
		
	}

}
