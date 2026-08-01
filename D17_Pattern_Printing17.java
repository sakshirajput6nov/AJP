package Qspider;
//     * 
//   *   * 
// *       * 
//   *   * 
//     *            

public class D17_Pattern_Printing17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		if(n%2==0) {
			System.out.println("can't print");
			return;
		}
		int mid=n/2+1;
		int start=mid;
		int end=mid;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=end;j++) {//for(int j=1;j<=n;j++) {
				if(j==start||j==end) {
					System.out.print("* ");
					// either this 
//					if(j==end) {
//						break;
//					}
				}
				else {
					System.out.print("  ");
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
