package FinalKeyword;

public class Food {
	// it is example of final keyword
	// value of final keyword cannot be modified
	// final block  cannot be invoked
	// the vale of final parameter can not be change
	// it cannot be increase by 1 nor decrease
	
	// this is example of blank final variable
	final int speedLimit= 90;
	void run(){
		System.out.println(" speedLimit is"+speedLimit);
		
	}

}
class bread extends Food{
	public static void main(String args[]) {
		bread b1= new bread();
		b1.run();
	}
	
}
