package ConstructorDemo;

public class Student4 {
	// it is example of parameterized constructor
	int id;
	String name;
	// creating a parameterized constructor
	 void insert(int i, String n) {
		id=i;
		 name =n;
	}
	
	void Display() {
		System.out.println(id+""+name);
		
	}
	public static void main(String args[]) {
		Student4 s= new Student4();
		Student4 s2= new Student4();
		Student4 s3= new Student4();
		s.insert(12," Ram");
		s2.insert(13," Shayam");
        s3.insert(14," Nop");
        s.Display();
        s2.Display();
        s3.Display();


		
	}
	

}
