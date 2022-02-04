package ConstructorDemo;

public class StaticKeywordDemo  {
	int rollno;
	String name;
	static String college="iit";
	
	//constructor
	StaticKeywordDemo(int i, String n){
		rollno=i;
		name=n;
		
		
	}
	void display() {
		System.out.println(rollno+""+name+""+college);
	}
 
public static void main (String args[]) {
		StaticKeywordDemo s1= new StaticKeywordDemo(1,"Ram");
		s1.display();
	}
}



