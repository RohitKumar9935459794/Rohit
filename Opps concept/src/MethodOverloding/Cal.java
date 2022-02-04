package MethodOverloding;

public class Cal {
	// this is example of method overloading with TypePromotion
	void sum(int a, int b, long c) {
		System.out.println(a+b+c);
	}
	void sum(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
	public static void main(String args[]) {
		Cal c= new Cal();
		c.sum(1, 5, -1);
		c.sum(2, 4, 5, 9);
		
	}

}
