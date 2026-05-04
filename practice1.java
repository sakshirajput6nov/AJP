
package javaclasspack;
import java.lang.Math;
//String to int ,digit ,reverse no.
//public class practice1 {
//	public static void main(String[]args) {
//		String num="1234";
//		int rem;
//		int ans=0;
//		int n=Integer.parseInt(num);
//		while(n!=0) {
//			rem=n%10;
//			ans=ans*10+rem;
//			n=n/10;
//		}
//		System.out.println(ans);
//	}
//}
///////////////// data type get conversion int to string 
//public class practice1 {
//	public static void main(String[]args) {
//		int n=1234;
//		String s=String.valueOf(n);
//		System.out.println(s.getClass().getSimpleName());
//		
//	}
//}
////////////////// all divisors
//
//public class practice1 {
//	public static void main(String[]args) {
////		System.out.println(Math.pow(2,3));
////		System.out.println(Math.sqrt(2));
//		int k=360;
//		int h=(int)Math.round(Math.sqrt(360))-1;
//		int[]arr=new int[h];
//		int i=1;
//		int f=0;
//		while(i<=Math.sqrt(k)) {
//			if(k%i==0) {
////				System.out.println(i);
//				arr[f++]=i;
//				
//			}
//			i++;
//		}
//		for(int e:arr) {
//			if(e!=0) {
//			System.out.println(e);}
//		}
//		
//		
//	}}
/////////////////////print n natural no. use recurssion
//public class practice1 {
//	static int i=1;
//	static void display(int num) {
//		System.out.println(i);
//		if(i>=num) {
//			return;
//		}
//		i++;
//		display(num);
//	}
//public static void main(String[]args) {
//	int n=34;
//	display(n);
//	
//}}
/////////////n times a name recurssion 
//public class practice1 {
//	static void name(int n,String nam) {
//		if(n<=0) {
//			return;
//		}
//	System.out.println(nam);
//	
//	n--;
//	name(n,nam);
//}
//	public static void main(String[]args) {
//		name(4,"Sakshi");
//	}
//}
///////////implement stack succesfull
////import java.util.*;
////import java.lang.Exception;
//public class practice1{
//	int size,top;
//	int[]arr;
//
//	public practice1(int capacity) {
//	
//	this.size=capacity;
//	this.top=-1;
//	arr=new int[capacity];
//	}
//	boolean isEmpty() {
//		if(top==-1) {
//			System.out.println("empty h");
//			return true;
//		}
//		return false;
//	}
//	boolean isFull(){
//		if(top==size-1){
//			return true;
//		}
//		return false;
//	}
//	void push(int item) throws Exception{
//		if(isFull()){
//			throw new Exception("full already");
//		}
//		else {
//			arr[++top]=item;
//		}
//		
//	}
//	void pop()throws Exception {
//		if(isEmpty()){
//			throw new Exception("empty csnt pop");
//		}
//	else {
//		System.out.println("poped element"+arr[top]);
//		top--;}
//		
//	}
//	void peek() {
//		if(isEmpty()) {
//			System.out.println("empty");
//		}
//		else {
//		System.out.println(arr[top]);
//		}
//	}
//	void display() {
//		if(isEmpty()) {
//			System.out.println("empty ");
//			
//		}
//		else {
//			for (int i=top;i>=0;i--) {
//				System.out.println(arr[i]);
//			}
//		}
//		
//	}
//	
//	public static void main(String[]args) {
//		practice1 p=new practice1(5);
//		try {
//		p.push(12);
//		p.display();
//		p.peek();
//		p.pop();
//		p.isEmpty();
//		p.push(90);
//		p.peek();
//		p.isEmpty();
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//	
//}
////////////////


