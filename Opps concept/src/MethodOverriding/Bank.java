package MethodOverriding;

public class Bank {
	// A real example of Java method overriding
	int grtRateOfIntrest() {
		return 0;
	}
}
	class SBI extends Bank{
		int grtRateOfIntrest() {
			return 8;
		}
	}
	class ICSC extends Bank{
		int grtRateOfIntrest() {
			return 7;
		}
	}
	class AXIS extends Bank{
		int grtRateOfIntrest() {
			return 6;
		}
	}
	 class test {
	public static void main(String args []) {
		SBI sbi= new SBI();
		ICSC icsc= new ICSC();
		AXIS axis= new AXIS();
		System.out.println(" Rate of intrest in SBI bank"+sbi.grtRateOfIntrest());
		System.out.println(" Rate of intrest in ICSC bank"+icsc.grtRateOfIntrest());
		System.out.println(" Rate of intrest in AXIS bank"+axis.grtRateOfIntrest());
		
		
	}
	 }


