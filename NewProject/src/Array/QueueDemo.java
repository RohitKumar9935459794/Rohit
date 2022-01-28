package Array;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String args[]) {
		// Queue is collection of element 
		// creating a Queue 
		//i am using priority Queue so that it sort automatically in  order
		Queue<String> queue= new PriorityQueue<>();
		
		//add() use for adding element in the Queue
		queue.add("Ram");
		queue.add("Sohan");
		queue.add("Mohan");
		queue.add("Shay");
		
		System.out.println(" Queue"+queue);
		
		// for select the top most element use peek()
		System.out.println(" top most element"+queue.peek());
		
		// if i want to see which element going to remove we use poll() instead of remove()
		System.out.println(queue.poll());
		
		//remove() use for remove element
		queue.remove("Ram");
		System.out.println(queue);

		
	}

}
