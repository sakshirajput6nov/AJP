package Qspider;
//    1
//   234
//  56789

public class D28_Pattern_Printing28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		if(n%2==0) {
			System.out.println("can't print");
			return;
		}
		int size=1;
		int space=n-1;
		int num=1;
		for(int i=1;i<=n;i++) {
			//method 1
			for(int j=1;j<=space;j++) {
				System.out.print("\t");// solve pattern problem for large n replace space by \t
			}
			for(int j=1;j<=size;j++) {


				System.out.print(num++ +"\t");
										
				
			}

			space--;
			size+=2;
			System.out.println();
		}
		
	}

}

