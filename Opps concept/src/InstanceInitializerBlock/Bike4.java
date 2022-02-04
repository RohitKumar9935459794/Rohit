package InstanceInitializerBlock;

public class Bike4 {
	Bike4(){
		System.out.println(" Bike is created");
	}



{System.out.println(" i am creating a new class");}
}
class TwoWheeler extends Bike4{
	TwoWheeler(){
		super();
		System.out.println(" Two wheeler is created");
	}
	{System.out.println(" i am creating CyCle calss");}
}
class Cycle1 extends TwoWheeler{
	Cycle1(){
	super();
	System.out.println(" Cycle is created");
	
}
	{System.out.println(" creating a new calss");
}
	public static void main(String args[]) {
		Cycle1 bike= new Cycle1();
		Bike4 bike2= new Bike4();
		TwoWheeler bike3= new TwoWheeler();
		
	}
	
	}
