package Qspider;
//     *
//   *   *
// *   *    *
//*   *   *   *

// based on 
//   *
//  **
// ***
//****
// by increasing space 
public class D8_patterPrint8 {
//imp 
	public static void main(String[] args) {
		
		
		int n=7;
		int size=1;

		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=size;k++) {
				System.out.print("*   ");// change
			}
			System.out.println();
			space--;
//			
			size++;
		}
		
	}

}