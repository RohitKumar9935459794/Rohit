package SuparKeywordDemo;

public class Animal {
	// Super can be used  to invoke parent class method
	void eat() {
		System.out.println(" the animale is eating");
		
	}

}
class Dog extends Animal{
	 void eat () {
		 System.out.println(" eating bread");
	 }
	 void bark() {
		 System.out.println(" the  dog is barking");
		 
	 }
		 void work() {
			 super.eat();
			 bark();
		 }
		 
		 public static void main(String args[]) {
			 Dog d= new Dog();
			 d.work();
					 
		 }
	 
}
