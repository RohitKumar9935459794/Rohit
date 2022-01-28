package Object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilizationExample {
	public static void main(String args[]) {
		try {
			// Creating the object
			Employee emp= new Employee( 19805,"Andrew");
			// Creating a stream and write the object
			FileOutputStream fout= new FileOutputStream("employee.txt");
			ObjectOutputStream out= new ObjectOutputStream(fout);
			out.writeObject(emp);
			out.flush();
			// closing the output Stream
			out.close();
			System.out.println(" Successfully Created");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
