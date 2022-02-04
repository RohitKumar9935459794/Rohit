package ConstructorDemo;

public class Student7 {
	// this is example of constructor without coping the constructor
	int id;
	 String name;
	 Student7(int i, String n){
		 id= i ;
		 name =n;
	 }
	 // creating an another constructor
	 Student7(){}
	 // creating an method Display()
	 void Display() {
		 System.out.println(id+""+name);
	 }
	 public static void main(String args[]) {
		 Student7 s1= new Student7(1,"Ram");
		 Student7 s2= new Student7();
		 // coping the constructor
		 s2.id=s1.id;
		 s2.name=s1.name;
		 s1.Display();
		 s2.Display();
	 }
	

}
