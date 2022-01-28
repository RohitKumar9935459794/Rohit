package Array;

import java.util.ArrayList;
import java.util.List;

public class StreamReduceDemo {
	public static void main(String args[]) {
		
		// Creating an ArrauList 
		List<Integer> numberList= new ArrayList<Integer>();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		
		// we use reduce() in StreamApi
		//reduce() use for change the complete  list reprasention(like Sum. multiply,etc) in a single line
		 int sum =numberList.stream().reduce(0,(ans,i)->ans+i);
		 System.out.println("Sum of the all element in arrayList:"+sum);
	
		
		
	}

}
