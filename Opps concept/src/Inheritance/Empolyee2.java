package Inheritance;

public class Empolyee2 {
	// this is multilevel inheritance  example
	
 void reading() {
	 System.out.println(" the Empolyee is reading");
 }
}
 class Ram extends Empolyee2{
	 void Writing() {
		 System.out.println("Ram is writting");
	 }
	
}
 class Ram1 extends Ram{
	 public static void main(String args[] ) {
	 Ram1 r= new Ram1();
	 r.reading();
	 r.Writing();
 }
 }
