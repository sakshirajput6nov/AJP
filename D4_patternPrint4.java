package Qspider;
//* * * 
//* * 
//* 
//* * 
//* * * 
public class D4_patternPrint4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int mid=n/2+1;// change here 
		int size=mid;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=size;j++) {
				System.out.print("* ");
			}
			if(i<mid) {// change here 
				size--;
			}
			else {
				size++;
			}
			System.out.println();
		}
	}

}
