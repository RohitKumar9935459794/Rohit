package Object;

import java.lang.reflect.Constructor;

public class newInstanceMethod {
	private String str;
	void CreatObjectExample4(){
		
	}
	public void setName(String str) {
		this.str=str;
	}
	public static void main(String args[]) {
		try {
			Constructor<newInstanceMethod> constructor=newInstanceMethod.class.getDeclaredConstructor();
			newInstanceMethod r= constructor.newInstance();
			r.setName("Java TPoint");
			System.out.println(r.str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}


}
