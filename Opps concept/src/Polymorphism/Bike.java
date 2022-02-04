package Polymorphism;

public class Bike {
	int speedLimit= 90;
}
class hond extends Bike{
	public static void main(String args[]) {
	 int speedLimit=150;
	 Bike  obj= new hond();
	 System.out.println(obj.speedLimit);
	 hond  obj1= new hond();
	 System.out.println(obj1.speedLimit);
	 
	
}
}
