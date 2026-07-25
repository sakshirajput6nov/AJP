package Qspider;
//*   *   *   *
//  *   *   *
//    *   *
//      *
public class D10_paternPrint10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		int size=n;

		int space=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=size;k++) {
				System.out.print("*   ");// change
			}
			System.out.println();
			space++;
//			
			size-=1;
		}
		
	}

}