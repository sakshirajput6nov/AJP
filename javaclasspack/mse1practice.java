package javaclasspack;
import java.util.*;
import java.util.stream.*;
//import java.util.Intstream;
//class mse1 {
//	String breed;
//	public void bd(String breed) {
//		this.breed=breed;
//	}
//	public void display() {
//		System.out.println(this.breed);
//		System.out.println(breed);
//	}
//	
//}
//public class mse1practice{
//	public static void main(String[]args) {
//		mse1 m=new mse1();
//		m.bd("pame");
//		m.display();
//	}
//}
/////////////////
//@FunctionalInterface
//interface dog{
//	int show(int x);
//}
//class mse1practice{
//	public static void main(String[]args) {
//		int k=2;
//	dog d=(int x)->x*x;
//	
//	System.out.println(d.show(k));
//	}
//}
/////////////////lambda exp.
//interface add{
//	int add1(int a,int b);
//}
//class mse1practice{
//	public static void main(String[]args) {
//		int k=10;
//		int l=9;
//		add p=(int a,int b)->a+b;
//		System.out.println(p.add1(k,l));
//		
//	}}
//////////////static method reference
//class ch{
//	public static int cal(int x) {
////		System.out.println("yes");
//		return x*x;
//	}}
//interface maath{
//	int dis(int a);
//}
//
//class mse1practice{
//	public static void main(String[]args) {
//		maath m=ch::cal;
//		System.out.println(m.dis(5));
//	}}
////////////object method reference
//class oops{
//	String hello(String name) {
//		return name;
//	}
//}
//interface naam{
//	String Hel(String k);
//}
//class mse1practice{
//	public static void main(String[]args) {
//		oops o=new oops();
//		naam op=o::hello;
//		String j="asd";
//		System.out.println(op.Hel(j));
//	}}
//////////////arbitrary object method reference
//interface MyInterface {
//    String show(String msg);
//}
//class mse1practice{
//	public static void main(String[]args) {
//		MyInterface ref = String::toUpperCase;
//
//		        // Method call
//		System.out.println(ref.show("java"));
//		    
//	}}
//////////////////constructor reference
//class jij{
//	jij(String name){
//		System.out.println(name);
//	}
//	
//}
//interface kk{
//	jij ll(String n);
//}
//class mse1practice{
//	public static void main(String[]args) {
//		kk m=jij::new;
//		m.ll("sakshi");
//	}}
//////////////////
/// unit 3 q1
//class mse1practice{
//	public static void main(String[]args) {
//		ArrayList<Integer> ar=new ArrayList<>();
//		ar.add(12);
//		ar.add(2);
//		ar.add(1);
//		ar.add(15);
//		ar.add(19);
//		Stream<Integer>st=ar.stream();
//		st.filter(n->
//		n%3==0 && n%5!=0)
//		
//		.forEach(m->System.out.println(m));
//		
//	}}
/////////////q2
//class mse1practice{
//	public static void main(String[]args) {
//		ArrayList<String> ar=new ArrayList<>();
//		ar.add("aman");
//		ar.add("sakshi");
//		ar.add("kanan");
//		ar.add("kanak");
//		ar.add("shriN");
//		Stream<String> st=ar.stream();
//		st.filter(name->name.endsWith("n")
//			).forEach(n->System.out.println(n));
//}}
///////////////q3
//class mse1practice{
//	public static void main(String[]args) {
//		int[]arr= {20000,30000,39000,23200,2300,50000,76000,56000,40000,89000};
//		IntStream st=Arrays.stream(arr);
//		st.filter(salary->salary>50000).forEach(n->System.out.println(n));
//	}}
////////////////q4
//class mse1practice{
//	public static void main(String[]args) {
//		
//		Stream<String>st=Stream.of("sakshi","esha","sakshee");
//		st.filter(name->name.contains("e")).forEach(n->System.out.println(n));
//		
//	}}
///////////////////q5
//class mse1practice{
//	public static void main(String[]args) {
//		Stream<Integer>st=Stream.of(12,34,47,321,11,13,67,78,89,66);
//		st.filter(n->{
//			boolean result=true;
//			for(int i=2;i<n;i++) {
//				if(n%i==0) {
//					result=false;
//					return result;
//				}
//			}
//			result=true;
//			return result;
//		}).forEach(n->System.out.println(n));
//	}
//	}
//////////////q6
//class mse1practice{
//	public static void main(String[]args) {
//		
//		Stream<Integer>st=Stream.of(45,6,7,8,77,54,23,45,10,45,56);
//		st.filter(n->n*n>500)
//	.forEach(n->System.out.println(n));
//	
//	}}
/////////////q7
//class mse1practice{
//	public static void main(String[]args) {
//		Stream<String>st=Stream.of("sakshi@gmail.com","sukanyagmail.com","somia@gmail");
//		st.filter(n->n.contains("@")&& n.contains(".")).forEach(n->System.out.println(n));
//	}}
/////////////use of stream,distinct,limit,skip,count
/// in count use long return type
//class mse1practice{
//	public static void main(String[]args) {
//		List<Integer>list=List.of(10,20,20,30,30,40,40,50,51,52,53);
//		long c=list.stream().distinct().limit(5).skip(3).count();
//		System.out.println(c);
//	}}
////////////////skip last two elements
//class mse1practice{
//	public static void main(String[]args) {
//		List<Integer>list=List.of(10,20,20,30,30,40,40,50,51,52,53);
//		int s=list.size();
//		List<Integer>result=list.stream().limit(s-2).toList();
//		System.out.println(result);
//	}
//}
/////////////
//class mse1practice{
//	public static void main(String[]args) {
//		List<Integer>list=List.of(10,20,20,30,30,40,40,50,51,52,53);
//		int s=list.size();
//		List<Integer>r1=list.stream().limit(s-2).toList();
//		System.out.println(r1);
//
//		
//	}}
//////////////reduce method to find sum of all elements

//class mse1practice{
//	public static void main(String[]args) {
//		List<Integer> list=Arrays.asList(12,3,4,5,6,7,8,9);
//		Stream<Integer>r=list.stream();
//		Optional<Integer>l=r.reduce((multi,a)->multi*=a);
//		System.out.println(l);
//		
//	}
//	}
///////////////////reduce() min value of element
//class mse1practice{
//	public static void main(String[]args) {
//		List<Integer> list=Arrays.asList(12,3,4,5,61,7,8,9);
//		Stream<Integer>r=list.stream();
//		Optional<Integer>l=r.reduce((a,b)->Math.min(a, b)
//		);
//		System.out.println(l);
//				
//	}
//}
/////////////////reduce() max value of element
//class mse1practice{
//public static void main(String[]args) {
//List<Integer> list=Arrays.asList(12,3,4,5,61,7,8,9);
//Stream<Integer>r=list.stream();
//Optional<Integer>l=r.reduce((a,b)->Math.max(a, b)
//);
//System.out.println(l);
//
//}
//}
///////////////////
// class mse1practice{
//public static void main(String[]args) {
//	List<String>list=Arrays.asList("sakshi","sukanya","sneha");
//	Optional<String>l=list.stream().reduce((a,b)->
//	a+b
//			);
//	System.out.println(l);
//}
//}
///////////////////count even no. using reduce
//class mse1practice{
//public static void main(String[]args) {
//	List<Integer>list=Arrays.asList(232,45,23,12,56,42);
//	Integer l=list.stream().reduce(0,(c,a)->{
//		if(a%2==0) {
//			c=c+1;
//			
//		}
//		return c;
//		
//	});
//	System.out.println(l);
//}
//}
//////////////////sum of all even no. using reduce
//class mse1practice{
//public static void main(String[]args) {
//	List<Integer>list=Arrays.asList(232,45,23,12,56,42);
//	Integer l=list.stream().reduce(0,(sum,a)->{
//		if(a%2==0) {
//			sum+=a;
//			
//		}
//		return sum;
//		
//	});
//	System.out.println(l);
//}
//}
///////////////////longest string in a list of string using reduce
//class mse1practice{
//public static void main(String[]args) {
//	List<String>list=Arrays.asList("sakshi","sukanya","sneha");
//	Optional<String> l=list.stream().reduce((a,b)->{
//		int k=Math.max(a.length(), b.length());
//		if(k==a.length()) {
//			return a;
//		}
//		return b;
//		
//	}
//	);
//	System.out.println(l);
//	
//}}
//////////////////use reduce to reverse a string not complete
//class mse1practice{
//public static void main(String[]args) {
//	String k="sakshi";
//	String l=k.reduce((a,b)->);
//	}
//}
/////////////////product of squares of no.
//class mse1practice{
//public static void main(String[]args) {
//	List<Integer>list=Arrays.asList(1,2,3,4);
//	Optional<Integer>l=list.stream().reduce((a,n)->a= a*n*n);
//	System.out.println(l);
//	
//}
//}
//////////////////multiple list into single list
//class mse1practice{
//public static void main(String[]args) {
//	List<Integer>list1=Arrays.asList(1,2,3,4);
//	List<Integer>list2=Arrays.asList(11,12,13,14);
//	List<Integer>list3=Arrays.asList(110,120,130,140);
//	List<Integer>l=
//	
//	
//	
//}}
///////////////////
class mse1practice{
public static void main(String[]args) {
	List<Integer>list=Arrays.asList(1,2,34,5,6,7);
	
	
}}
////github setup
