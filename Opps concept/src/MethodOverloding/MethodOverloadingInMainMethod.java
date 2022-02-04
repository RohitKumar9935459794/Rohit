package MethodOverloding;

public class MethodOverloadingInMainMethod {
	public static void main(String args) {
		System.out.println(" main with string");
	}
	// you can also overloading method but JVM is only catch Array method
		public static void main(String args[] ) {
			System.out.println(" main without arr");
			
		
	}
		public static void main() {
			System.out.println( " main without String");
		}

}
