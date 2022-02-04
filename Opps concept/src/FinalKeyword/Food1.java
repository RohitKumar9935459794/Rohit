package FinalKeyword;

public class Food1 {
	// final method can also inherited
	 final void eat() {
		 System.out.println(" ram is eating");
	 }
	}
 class Pizza extends Food1{
	//super.eat();
	public static void main(String args[]) {
		Pizza p= new Pizza();
		p.eat();
	}
	 
 }
