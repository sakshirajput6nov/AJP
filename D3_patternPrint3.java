package Qspider;
//* 
//* * 
//* * * 
//* * 
//*

public class D3_patternPrint3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=1;
		int n=5;
		int mid=n/2+1;// change here 
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=size;j++) {
				System.out.print("* ");
			}
		
		if(i<mid) {//change here 
			size++;
		}
		else {
			size--;
			
		}
		System.out.println();
		}
	}

}
