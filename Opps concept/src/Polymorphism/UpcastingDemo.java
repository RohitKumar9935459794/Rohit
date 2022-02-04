package Polymorphism;

public class UpcastingDemo {
	// Polymorphism  shows
	// is-a relationship
	// is-a-i relationship
	// is-a-object relationShip
	// inheritance called runtime polymorphism
	
	void run() {
		System.out.println(" Ram is running");
	}
	}
class Ram extends UpcastingDemo{
	public static void main(String args[]) {
		// here i am up casting the class
		UpcastingDemo up= new Ram();
		up.run();
	}
}
