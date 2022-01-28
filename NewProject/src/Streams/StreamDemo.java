package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String args[]) {
		// creating an arrayList
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		
		// add() for adding element
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println(arrayList);
		
		//printing square using ArrayList
		List<Integer> squareList= new ArrayList<Integer>();
		for(Integer i: arrayList) {
			squareList.add(i*i);
		}
		 System.out.println(squareList);
		 
		 // printing  square using  Stream
		 Set<Integer> squarSet1 = arrayList.stream().map(x->x*x).collect(Collectors.toSet());
		 System.out.println(" set of squared  number:"+squarSet1);
		 
	}

}
