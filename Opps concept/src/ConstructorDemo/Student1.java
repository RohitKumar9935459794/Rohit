package ConstructorDemo;

public class Student1 {
	 // Real usage of this constructor call
	int rollno;
	String name, course;
	float fee;
	Student1( int rollno, String name,String course){
		this.rollno= rollno;
		this.name=name;
		this.course=course;
		
		
		
	}
	Student1( int rollno, String name,String course, float fee){
		this.rollno= rollno;
		this.name= name;
		this.course=course;
		this.fee=fee;
	}
	void display() {
		System.out.println(" "+rollno+""+name+""+ course+""+fee);
	}
	
	public static void main(String args[]) {
		Student1 S1= new Student1(12,"Rohit","BCM");
		Student1 s2= new Student1(11," Ram","BCA",120000f);
		S1.display();
		s2.display();
	}
	

}
