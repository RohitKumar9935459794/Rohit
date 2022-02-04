
public class Covarient {
	 Covarient get() {
		return this;
	}
}
class b1 extends Covarient{
	b1 get() {
		return this;
	}
	void message() {
		System.out.println("  Welcome ");
	}

	public static void main(String args[]) {
		new b1().get().message();
	
	
	}
}
