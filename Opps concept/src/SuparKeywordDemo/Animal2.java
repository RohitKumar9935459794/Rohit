package SuparKeywordDemo;

public class Animal2 {
	  Animal2(){
		//Super is used to invoke is parent class constructor 
		System.out.println(" Animal is  created ");
	}
}
	class  cat extends Animal2{
	 cat(){
			 super();
			 System.out.println (" Dog is created");
			 
		}
		
		public static void main(String args[]) {
			cat d= new cat();
			
		}
	}


