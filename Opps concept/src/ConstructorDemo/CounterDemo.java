package ConstructorDemo;

public class CounterDemo {
	/*  here i am using count without static keyword whose output is only 1,1,1
	 * 
	 *int count=0;
	// constructor
	CounterDemo(){
		count++;
		
		
	}
	void Display() {
		System.out.println("Count is"+count);
	}
	public static void main(String args[]) {
		CounterDemo c1= new CounterDemo();
		CounterDemo c2= new CounterDemo();
	    CounterDemo c3= new CounterDemo();
	    c1.Display();
	    c2.Display();
	    c3.Display();
		
	}*/
	
	//here i using the Count with static keyword
	static int count=0;
	CounterDemo(){
		count++;
		System.out.println("Count is"+count);
	} 
		public static void main(String args[]) {
			
				CounterDemo c1= new CounterDemo();
	            CounterDemo c2= new CounterDemo();
			    CounterDemo c3= new CounterDemo();
			}
				
			
			
		}
	


