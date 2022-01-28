package Object;

public class CreatObject1 {
	String name;
	void insert(String n) {
		n=name;
	}
	public static void maim(String args) {
	// using new object
	CreatObject1 o1= new CreatObject1();
	o1.insert("Ram");
	

}
}
