package Qspider;
//      1
//     222
//    33333
//   4444444
//OR problem in for large n
//       1
//      123
//     12345
//    1234567
//OR
// ABCD pattern
public class D25_Pattern_Printing25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		if(n%2==0) {
			System.out.println("can't print");
			return;
		}
		int size=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("\t");// solve pattern problem for large n replace space by \t
			}
			for(int j=1;j<=size;j++) {
//				System.out.print("\t "+i);// 22222
										//3333333
//				System.out.print(j+" ");// 12
										//1234
				System.out.print("\t "+(char)(64+i));// ABCD pattern
			}
			space--;
			size+=2;
			System.out.println();
		}
		
	}

}


