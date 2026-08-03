package Qspider;
//     1
//    321
//   54321
public class D27_Pattern_Printing27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		if(n%2==0) {
			System.out.println("can't print");
			return;
		}
		int size=1;
		int space=n-1;
//		int num=1;//method 2 i
		for(int i=1;i<=n;i++) {
			int num=size;//method 1
			for(int j=1;j<=space;j++) {
				System.out.print("\t");// solve pattern problem for large n replace space by \t
			}
			for(int j=1;j<=size;j++) {


				System.out.print(num--+"\t");
										
				
			}
//			num+=2*i+1;//method 2 ii
			space--;
			size+=2;
			System.out.println();
		}
		
	}

}


