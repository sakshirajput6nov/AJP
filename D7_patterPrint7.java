package Qspider;
//  *
// ***
//*****
// imp
public class D7_patterPrint7 {

	public static void main(String[] args) {
	
		
			int n=7;
			int size=1;//chnge
//			
			int space=n-1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {//chnge
					System.out.print("  ");
				}
				for(int k=1;k<=size;k++) {//chnge
					System.out.print("* ");
				}
				System.out.println();
				space--;//chnge
//				size=2*i+1;//chnge or
				size+=2;
			}
			
		}

	}