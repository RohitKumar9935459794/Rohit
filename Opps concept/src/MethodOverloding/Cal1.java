package MethodOverloding;

public class Cal1 {
	// this is example of  method overLoading TypePromotion if matching is found
void sum( int a, int b) {
	System.out.println(a+b);
}
void sum(double a, double b) {
	System.out.println(a+b);
}


public static void main(String args[]) {
	Cal1 c= new Cal1();
	c.sum(12, 34);
	c.sum(123.43, 124.6);
}
//this is example of method overloading with TypePromotion in case of ambiguity
	// this gives me compile time error 
	/* void sub( int a , long b) {
		 System.out.println(" method a is invoked");
	 }
	 void sub(long a, int b) {
		 System.out.println(" method b is invoked");
	 }
	 public static void main(String args[]) {
		 Cal2 c= new Cal2();
		 // now ambiguity
		 c.sub(12,34);
	 }*/

}
