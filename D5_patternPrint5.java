package Qspider;
//    *
//   **
//  ***
// ****
//*****

public class D5_patternPrint5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int size=1;//chnge
		int space=n-1;//chnge
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {//chnge
				System.out.print("  ");
			}
			for(int k=1;k<=size;k++) {//chnge
				System.out.print("* ");
			}
			System.out.println();
			space--;//chnge
			size++;//chnge
		}
		
	}

}
