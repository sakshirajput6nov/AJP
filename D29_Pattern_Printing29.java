package Qspider;
//1	
//3	2	1	
//5	4	3	2	1	
//7	6	5	4	3	2	1	
//9	8	7	6	5	4	3	2	1	

public class D29_Pattern_Printing29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		int size=1;
		
		int num=1;
		for(int i=1;i<=n;i++) {
			
			
			for(int j=1;j<=size;j++) {


				System.out.print(num-- +"\t");
										
				
			}
			num=num+2*i+1;
			
			size+=2;
			System.out.println();
		}
		
	}

}

