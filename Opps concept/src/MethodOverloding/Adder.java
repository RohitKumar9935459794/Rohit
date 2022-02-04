package MethodOverloding;

public class Adder {
	// this is example of method overloading by changing the argument
	// methodOverloading is not possible by only changing return type
	static int add( int a, int b) {
		return a+b;
		
	}
	static double add( double a, double b, double c) {
		return a+b+c;
	}
	
	public static void main(String args[]) {
		System.out.println(Adder.add(1,2));
		System.out.println(Adder.add(12.3,12.0,12.5));
	}

}
