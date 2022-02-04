package ConstructorDemo;

public class Student6 {
	// calling parameterized constructor from default constructor
	Student6(){
		this(5);
		System.out.println(" Hello word");
	}
	Student6(int x){
		System.out.println(x);
	}
	public  static void main(String args[]) {
		Student6 a = new Student6();
	}

}
