package ConstructorDemo;

public class Student3 {
	// provoking this keyword
	void m() {
		System.out.println(this);
		//print same reference ID
	}
	public static void main (String args[]) {
		Student3 obj= new Student3();
		//print the same reference id
		obj.m();
	}

}
