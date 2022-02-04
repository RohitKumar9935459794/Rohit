package ConstructorDemo;

public class CoyConstructorDemo {
	// is is Demo of copy constructor by constructor
	int id;
	String name;
	CoyConstructorDemo(int i,String n){
		id=i;
		name=n;
		
	}
	// Constructor to initialize another object
	CoyConstructorDemo(CoyConstructorDemo n2){
		id=n2.id;
		name=n2.name;
		
	}
	// creating a display method
	void display() {
		System.out.println( id+" "+name);
	}
	public static void main(String args[]) {
	CoyConstructorDemo n2= new CoyConstructorDemo( 12,"Ram");
	CoyConstructorDemo d= new CoyConstructorDemo(n2);
	n2.display();
	d.display();
	
	}
	
	


	 
	

}
