package Qspider;
//15	
//13	14	
//10	11	12	
//6	7	8	9	
//1	2	3	4	5
public class D30_Pattern_Printing30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int size=1;

		int num=(n*(n+1))/2;// n no. ka sum
		for(int i=1;i<=n;i++) {

			for(int j=1;j<=size;j++) {


				System.out.print(num++ +"\t");
										
				
			}
			num=num-(2*i+1);
			
			size++;
			System.out.println();
		}
		
	}

}
