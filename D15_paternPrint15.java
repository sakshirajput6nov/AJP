package Qspider;
//*******
// *****
//  ***
//   *
//  ***
// *****
//*******
// imp. 
public class D15_paternPrint15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int mid=n/2+1;
		int size=n;
		int space=0;
		for(int k=1;k<=n;k++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int i=1;i<=size;i++) {
				System.out.print("* ");
			}
			if(k<mid) {
				space++;
				size-=2;
			}
			else {
				space--;
				size+=2;
			}
			System.out.println();
			
		}
		
		
	}

}
