package Qspider;
//        9
//       876
//      54321
public class D31_Pattern_Printing31 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num=n*n;// 
		int size=1;
		int space=n-1;
		
		for(int i=1;i<=n;i++) {

			for(int j=1;j<=space;j++) {


				System.out.print("\t");
										
				
			}
			for(int j=1;j<=size;j++) {
				System.out.print(num-- +"\t");
			}
			
			
			size+=2;
			space--;
			System.out.println();
		}
		
	}

}
