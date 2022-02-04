package InstanceInitializerBlock;

public class Bike {
	// Example of instance initializer block
 int Speed;
 Bike(){
	 System.out.println(" Speed is"+ Speed);
 }
 // Here i am creating an instance block
 {Speed=100;}
 public static void main (String args[]) {
	 Bike bike= new Bike();
	 
	 
 }
}
