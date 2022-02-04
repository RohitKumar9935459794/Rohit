
public class ThisKeywordDemo {
	int rollno;
	String name;
	void insert(int rollno, String name){
		this.rollno=rollno;
		this.name=name;
	}
	void display() {
		System.out.println(rollno+""+name);
	}
	
public static void main(String args[]) {
ThisKeywordDemo n1= new ThisKeywordDemo();
n1.insert(12, "ram");
n1.display();
		
	}

}
