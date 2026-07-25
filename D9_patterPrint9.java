package Qspider;

//* * * *
//  * * 
//   *
public class D9_patterPrint9 {

	public static void main(String[] args) {
		//imp
			
			
			int n=7;
			int size=2*n-1;

			int space=0;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<=size;k++) {
					System.out.print("* ");// change
				}
				System.out.println();
				space++;
//				
				size-=2;
			}
			
		}

	}