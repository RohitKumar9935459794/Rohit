package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamsDemo {
	public static void main(String args[]) {
		// Creating am array list
		List<String> arrayList= new ArrayList<String>();
		
		// add() use for adding element in the list
		arrayList.add("Ram");
		arrayList.add("Sohan");
		arrayList.add("ravi");
		arrayList.add("poman");
		
		System.out.println(" Array list is"+arrayList);
		
		// printing the latter Starts with p
		List<String> filterList= new ArrayList<>();
		for(String s: arrayList) {
			if (s.startsWith("p")){
				filterList.add(s);
			}
			
		}
			System.out.println(filterList);
			
			// Now printing the latter Start with p using Stream API
			List<String> filterResult= arrayList.stream().filter(S->S.startsWith("p"))
					.collect(Collectors.toList());
			System.out.println(" Name start with p"+filterResult);
			
			//  sorted() is used to sorted  form printing the streamApi  
			 List<String> sortedList = arrayList.stream().sorted().collect(Collectors.toList());
			 System.out.println(" the elemrnt is"+sortedList);
			 
			 //  use of forEach block  in StremApi
			 // forEach () used for printing the element one by one
			 System.out.println(" printing all element one by one :");
			 arrayList.stream().forEach(y->System.out.println(" element is:"+y));
			 
			 
			 
			
		
		
	}

}
