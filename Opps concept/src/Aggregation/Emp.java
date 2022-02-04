package Aggregation;

public class Emp {
	int id ;
	String name;
	// aggregation 
	Address address;
	
	public Emp(int id , String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display() {
		System.out.println( id+""+name);
		System.out.println(address.city+""+address.state+""+address.country);
	}
	
	public static void main(String args[]) {
		
		Address address1= new Address("Ranchi","Jharkhand","India");
		Address address2= new Address("Chatra","Jharkhand","India");
		Emp E1= new Emp(12,"Ram",address1);
		Emp E2= new Emp(11,"Rohan",address2);
		E1.display();
		E2.display();
		
	}

}
