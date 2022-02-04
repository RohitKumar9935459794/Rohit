import java.util.Scanner;

public class Demo {

	
	static int n1;
	static int n2;

	
	public  static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter first n");
		n1=sc.nextInt();
		System.out.println(" Enter second number");
		n2= sc.nextInt();
		Demo d= new Demo();
		d.Sub();
	
	
		
	}
	void add() {
		System.out.println(n1+n2);
		
		
		
		
	}
	void Sub() {
		System.out.println(n1-n2);
		
		// here i am use this keyword for invoke insert method
		this.add();

}

	
	
}
