package Qspider;
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 
public class D2_patternPrint2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method 1
//		int n=5;
//		int patternSize=n;
//		for(int i=1;i<=n;i++) {
//			for(int j=patternSize;j>=1;j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//			patternSize--;
//		}
		
		// method 2 universal
		int n=5;
		int patternSize=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=patternSize;j++) {
				System.out.print("* ");
			}
			System.out.println();
			patternSize--;// change only here 
		}		
	}

}
