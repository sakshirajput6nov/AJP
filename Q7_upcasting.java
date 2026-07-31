package Qspider;
//............
// upcasting down casting
public class Q7_upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uu=10;
//		Shape u=new Circlee();// up casting not risky bcz give error at compile time
		Shape u=new Circle();// up casting
		System.out.println(u.ss);
//		System.out.println(u.cc);// give error 
		Circle c=new Circle();
		System.out.println(c.cc);
		System.out.println(c.ss);
//		Circle o=(Rectangle)u;// bug error at run time so it is risky 
		Circle o=(Circle)u;// downcasting
		System.out.println(o.ss);
		System.out.println(o.cc);
		
	}

}
class Shape{
	int ss=11;
}
class Circle extends Shape {
	int cc=12;
	
}
