package Array;

import java.util.LinkedList;


public class LinkListDemo {
	

	public static void main(String args[]) {
		
	// Creating an LinkList 
		//because in LinkedList i put size is default so i can enter as much as information
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		
		// add() use for adding integer in list
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.println(list);
		
		// for adding any thing in first we use addFirst
		list.addFirst(4);
		System.out.println(list);
		
		//for adding any thing in last od list use addLaet()
		list.addLast(9);
		System.out.println(list);
		
		// for removing any thing from the list use remove()
		list.remove(1);
		list.remove(3);
		System.out.println(list);
		
	}

}
