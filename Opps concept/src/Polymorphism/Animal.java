package Polymorphism;

public class Animal {
	void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println(" Dog is eating");
	}
}
class cat extends Animal{
	void eat() {
		System.out.println("cat is eathing");
	}
}
class Lion extends Animal{
	void eat() {
	System.out.println("Lion is eating Meat");
	}
}


class poly{
	public static void main(String args[]) {
	Animal a;
	a= new Dog();
	a.eat();
	a=new cat();
	a.eat();
	a=new Lion();
	
	
	
}
}
