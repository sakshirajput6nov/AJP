package Qspider;
//*
//**
//***
//1
//22
//333
//4444
//55555
public class D1_patternPrint1 {

	public static void main(String[] args) {
		// method 1
		
//		int n=5;
//		for(int r=1;r<=n;r++) {
//			for(int c=1;c<=r;c++) {
////				System.out.print(r);
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// method 2 universal \
		int n=5;
		int patternSize=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=patternSize;j++) {
				System.out.print("* ");
//				System.out.print(i+"");
			}
			System.out.println();
			patternSize++;
		}
		
		
		
		
	}

}

