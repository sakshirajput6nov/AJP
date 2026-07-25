package Qspider;

public class D6_patternPrint6 {

	public static void main(String[] args) {
			int n=7;
			int size=n;//chnge
//			int space=n-size;//chnge
			int space=0;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {//chnge
					System.out.print("  ");
				}
				for(int k=1;k<=size;k++) {//chnge
					System.out.print("* ");
				}
				System.out.println();
				space++;//chnge
				size--;//chnge
			}
			
		}

	}