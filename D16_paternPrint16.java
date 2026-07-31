package Qspider;
// new h yeh 
// imp
//*     *
//**   **
//*** ***
//*******
//*** ***
//**   **
//*     *
public class D16_paternPrint16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int mid=n/2+1;
		int start=1;
		int end=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=start || j>=end) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			if(i<mid) {
				start+=1;
				end-=1;
			}
			else {
				start--;
				end++;
			}
			System.out.println();
			
		}
	}

}
