package Polymorphism;

public class Animal1 {
	void eat() {
		System.out.println(" Animal is eating");
	}
}
class Dog1 extends Animal1{
	void eat() {
		System.out.println(" Dog is eating berad");
	}
}
class babyDog extends Dog1{
	void eat() {
		System.out.println(" baby dog is drinking milk");
	}
	public static void main(String args[]) {
		Animal a;
		a= new Animal();
		a.eat();
		 Dog1 a1= new Dog1();
		 a1.eat();
		 babyDog a2= new babyDog();
		 a2.eat();
		
	}
}

	