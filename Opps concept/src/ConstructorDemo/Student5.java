package ConstructorDemo;

public class Student5 {
	// this keyword is invoked current class constructor
	Student5(){
		System.out.println(" hello a");

	}
	Student5(int x){
		this ();
		System.out.println(x);
		
	}



	public static void main(String args[]) {
		Student5 a = new Student5(10);
	}
}