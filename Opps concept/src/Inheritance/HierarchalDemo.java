package Inheritance;

public class HierarchalDemo {
	// this is example of Hierarchical inheritance 
	void eating() {
		System.out.println("  Ram is eating");
	}

}
class Sohan extends HierarchalDemo{
	
	void dansing() {
		System.out.println(" Sohan is dancing");
	}
		public static void main(String args[]) {
			Sohan sohan= new Sohan();
			sohan.dansing();
		}
	}
	
// multiple inheritance cannot be supported by java
//Due to which we cannot use hybrid inheritance 


class Shyam extends HierarchalDemo{
	void Seating() {
		System.out.println(" Sohan is eating");
	}
}
class test extends Shyam{
	public static void main(String args[]) {
		Shyam s= new Shyam();
		s.eating();
		s.Seating();
		//s.dansing(); cannot be called
		
		
	
	}
}
