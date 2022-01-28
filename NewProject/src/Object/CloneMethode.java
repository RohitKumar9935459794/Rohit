package Object;

// need to implement Cloneable
public class CloneMethode  implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	String str = " New object Created";
	public static void main(String args[]) {
		// creating a new object of class
		CloneMethode obj= new CloneMethode();
		try {
			CloneMethode obj2= (CloneMethode)obj.clone();
			System.out.println(obj2.str);
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	
	

}
