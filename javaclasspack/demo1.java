package javaclasspack;
//class Person
//{
//	void display(String name,int age) {
//		System.out.println("name is "+name+" and age is "+age);
//	}
//}
//class Student extends Person{
//	
//	System.out.println("name is "+name+"and age is "+age);
//	
//}
//
//public class demo1 {
//	public static void main(String[]args) {
//		Student s=new Student();
//		s.display("Sakhi",11);
//	}
//	
//	
//}
////
//class Person{
//	
//	Person(String name,int age){
//		System.out.println("name is"+name +" and age is "+age);
//	}
//	
//}
//class Employee{
//	Employee(String names ,int ages){
//		
//	}
//}
//class demo1{
//	public static void main(String[]args) {
//		int a=10;
//		int b=12;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("a is "+a+"and b is "+b);
//	}
//}
//class MathOp{
//	void show(float a,float b) {
//		System.out.println("int int");
//	}
////	void show(String a,double b) {
////		System.out.println("string double");
////	}
////	void show(int a,double b) {
////		System.out.println("int double");
////	}
////	
//}
//class demo1{
//	public static void main(String[]args) {
//		MathOp op=new MathOp();
////		op.show(12, 120);
//		op.show(12.6f, 120f);
////		op.show(12, 120.08);
//		
//	}
//}
/////////////////
//record Employee(int id,String name,int Salary){}
//class demo1{
//	
//	
//	public static void main(String[]args) { 
//		Employee e=new Employee(101,"sakhi",235679);
//		System.out.println(e);
//		System.out.println(e.id());
//		System.out.println(e.name());
//		System.out.println(e.Salary());
//	}
//}
/////////////////
sealed class Person permits Employee,Student{
	void show() {
		System.out.println("welcome to sealed person");
	}
}
final class Employee extends Person{
	void show() {
		System.out.println("welcome to  final employee class");
	}
}
non-sealed class Student extends Person{
	void show() {
		System.out.println("welcome to  non sealed Student class");
	}
}
public class demo1{
	public static void main(String[]args){
		Person p1=new Employee();
		Person p2=new Student();
		p1.show();
		p2.show();
		
		
	}
}
