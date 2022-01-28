package Array;

import java.util.Stack;

public class StacksDemo {
	public static void main(String args[]) {
		// Stacks is special type of sets
		// creating a Stack
		Stack<String> stack= new Stack<>();
		
		//push() use for adding elements to Stack
		//it print through opposite direction
		stack.push("Ram");
		stack.push("Shyam");
		stack.push("Mohan");
		stack.push("Suraj");
		
		System.out.println(stack);
		
		//peek() use for print the top element
		System.out.println("Top element is "+stack.peek());
		
		//pop() use for remove element from Stack but it only remove top most element
		stack.pop();
		System.out.println(stack);
		
	}

}
