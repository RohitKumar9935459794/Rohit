package ConstructorDemo;

import java.util.Scanner;

public class StaticMethod {
	static int n;
	static int Cube(int i) {
		return i*i*i;
		
	}
	public static void main(String args[]) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter number");
		n =sc.nextInt();
	}catch(Exception e) {
		e.printStackTrace();
	}
	//public static void main(String args[]) {
		int result=  StaticMethod.Cube(n);
		System.out.println( " Cube is"+result);
	}

}
