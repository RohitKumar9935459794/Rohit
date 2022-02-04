package ConstructorDemo;

public class Student2 {
	//Example of this keyword thgat you return a a statement from he method 
	Student2 getStudent2() {
		return this;
	}
	void msg() {
		System.out.println("Hello word");
	}
	
		public  static void main(String args[]) {
			new Student2().getStudent2().msg();
		
	}
}