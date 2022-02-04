
public class DefaultConstructoirDemo {
	// creating a default constructor
	// constructor is same name as  class and method is different name
	DefaultConstructoirDemo(){
		System.out.println(" constructed is createad ");
	}
	// i am creating a method for  so that i can use constructor
	void ride() {
		System.out.println(" the bike is running");
	}
	public static void main(String args []) {
		DefaultConstructoirDemo b= new DefaultConstructoirDemo();
		b.ride();
		
	}
	

}
