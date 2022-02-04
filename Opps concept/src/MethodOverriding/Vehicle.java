package MethodOverriding;

public class Vehicle {
	// this is example of method overriding 
	/* conditions of method overriding
	 * the method must have same name as the parent class
	 * the method must have the same parameter as parent class
	 * there must be IS_A relationShip
	 */
	void run() {
		System.out.println(" vehicle is running");
	}
}

	 class bike extends Vehicle{
		void run() {
			System.out.println(" Bike is running");}
		
		
		
		public static void mian(String args[]) {
			bike b= new bike();
			b.run();
			
		
	}
}
