package Inheritance;

public class Empolyee1 {
	// this is simple inheritance example (Single inheritance)
	float salary= 400000;

}
class Emp extends Empolyee1{
	 int id ;
	 String name;
	 Emp(int id,String name){
		 this.id=id;
		 this.name=name;
	 }
	 void display() {
		 System.out.println(" Id:"+id+"Name"+ name+"Salary"+salary);
	 }
	 public static void main(String args[]) {
		 Emp e1= new Emp(1,"Ram");
		 Emp e2= new Emp(2,"Shyam");
		 Emp e3= new Emp(3,"Riya");
		 e1.display();
		 e2.display();
		 e3.display();
		 
		 
	 }
	
}
