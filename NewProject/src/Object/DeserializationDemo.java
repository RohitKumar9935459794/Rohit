package Object;

import java.io.*;

public class DeserializationDemo {
	
	public void main(String args[]) {
		try {
			//Creating a stream to read the object 
			ObjectInputStream in= new ObjectInputStream( new FileInputStream(" employee.txt"));
			Employee e=( Employee)in.readObject();
			// prints the data of serialized object
			System.out.println(e.empid+""+e.empname);
			//closing the input stream
			in.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}


}
