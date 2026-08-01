package Qspider;
//     1
//    222
//   33333
//  4444444
//   55555
//    666
//     7
// or write A B C
//     A
//    BBB
//   CCCCC
//    DDD
//     E
public class D24_Pattern_Printing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		if(n%2==0) {
			System.out.println("can't print");
			return;
		}
		int mid=n/2+1;
		int start=mid;
		int end=mid;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {//for(int j=1;j<=n;j++) {
				if(j<start||j>end) {
					System.out.print("  ");

				}
				else {
//					System.out.print((char)(64+i)+" ");
					System.out.print(i+" ");
				}
			}
			if(i<mid) {
				start--;
				end++;
			}
			else {
				start++;
				end--;
			}
			System.out.println();
		}
		
	}

}


