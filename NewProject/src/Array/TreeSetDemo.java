package Array;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String args[]) {
		// creating a TreeSet
		TreeSet<String> treeSet= new TreeSet<String>();
		
		// add() use for add element on set
		treeSet.add("Ram");
		treeSet.add("Shyam");
		treeSet.add("Rohit");
		treeSet.add("Komal");
		System.out.println(treeSet);
		
		// remove() use for remove element from set
		treeSet.remove("Ram");
		System.out.println(treeSet);
	}

}
