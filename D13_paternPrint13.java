package Qspider;
//      *
//     ***
//    *****
//     ***
//      *
public class D13_paternPrint13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=9;
		int mid=n/2+1;
		int size=1;

		int space=n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=size;k++) {
				System.out.print("* ");// change only
			}
			System.out.println();
			if(i<mid) {
				space--;
				size+=2;
			}
			else {
				size-=2;
				space++;
			}

		}
		
	}

}
