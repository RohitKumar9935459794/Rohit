package MethodOverloding;

public class Cal2 {
	
	void sub( int a , int b) {
		 System.out.println(" method a is invoked");
	 }
	 void sub(long a, long b) {
		 System.out.println(" method b is invoked");
	 }
	 public static void main(String args[]) {
		 Cal2 c= new Cal2();
		 // now ambiguity
		 c.sub(12,34);
	 }

}
