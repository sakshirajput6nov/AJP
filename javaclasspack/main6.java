package javaclasspack;
interface Calculator{
	static void square(int n) {
		System.out.println("Square of a number is"+ n*n);
	}
	static void cube(int n) {
		System.out.println("Cube of a number is"+ n*n*n);
	}
}
interface MathUtility{
	static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	static boolean isPrime(int n) {
		if(n==1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
interface Addition{
	void add(int a,int b) {
		
	}
}


public class main6 implements Calculator,MathUtility{
	public static void main(String[]args) {
//	main6 m1=new main6();
	Calculator.square(5);
	Calculator.cube(3);
	if(MathUtility.isEven(34)) {
		System.out.println("EVen");
	}
	else{
		System.out.println("Odd");
	}
	
	if(MathUtility.isEven(343)) {
		System.out.println("EVen");
	}
	else{
		System.out.println("Odd");
	}
	if(MathUtility.isPrime(34)) {
		System.out.println("yes prime ");
	}
	else{
		System.out.println("not prime");
	}
	if(MathUtility.isPrime(13)) {
		System.out.println("yes prime");
	}
	else{
		System.out.println("not prime");
	}
	

	}
}
