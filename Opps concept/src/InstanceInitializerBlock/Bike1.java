package InstanceInitializerBlock;

public class Bike1 {
	int speed;
	Bike1(){
		System.out.println(" the Speed is"+speed);
	}
	// here i am creating to instance block
	{speed= 23;}
	{System.out.println(" Instance Block is involed");}
	public static void main(String args[]) {
		Bike1 bike= new Bike1();
	}
	

}
