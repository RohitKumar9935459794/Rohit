package InstanceInitializerBlock;

public class Bike3 {
	// here i am created the constructor  if bike  class
	Bike3(){
		System.out.println(" cike is created");
	}

}
// creating a new class
class Cycle extends Bike3{
	Cycle(){
		// here i am using super key word for coping the constructor for above class
		super();
		System.out.println(" Cycle is created");
	}
	
	// here i am creating instance block
	
	{System.out.println(" method is involed");}
	class test{
		public static void main(String args[]) {
			Bike3 bike= new Bike3();
		
	}
		
	}
}


