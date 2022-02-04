package MethodOverloding;

public class Address {
	// Method Overloading without changing any argument
	static int add( int a, int b) {
		return a+b;
	}
	static int add( int a, int b, int c) {
		return a+b+c;
	}

		public static void main(String args[]){
			 System.out.println(Address.add(2,3));
			 System.out.println(Address.add(1,2,3));
		
	}

}
