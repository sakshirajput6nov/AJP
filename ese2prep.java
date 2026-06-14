package javaclasspack;

import java.util.Arrays;
import java.util.List;

//class Main{
//	void display() {
//		
//		System.out.println("display Main");
//	}
//	void show() {
////		
//		System.out.println("show ese2prep");
//	}
//}
//public class ese2prep extends Main {
//	static int o;
//	String name;
//	int age;
//	ese2prep (){
//		System.out.println("default explicit");
//	}
//	ese2prep (int x,String n){
//		age=x;
//		name=n;
//		System.out.println("parameterised ");
//	}
//	ese2prep (ese2prep s1){
//		age=s1.age;
//		name=s1.name;
//		System.out.println("copy");
//	}
////	void show() {
//////		
////		System.out.println("show ese2prep");
////	}
//	
//	
//	
//	 void display() {
////		
//		System.out.println("display ese2prep");
//	}
//	public static void main(String[] args) {
//		//TODO Auto-generated method stub
//		Main e=new ese2prep();
//		e.display();
//		e.show();
//		
////		ese2prep s1=new ese2prep(20,"sakshi");
////		ese2prep s2=new ese2prep(s1);
////		ese2prep.display();
//		
//	}
//
//}
//  chaining overloading this()
//public class ese2prep{
//	ese2prep(){
//		this("sakshi");
//		System.out.println("default cons");
//	}
//	ese2prep(String name){
//		this(1,name);
//		System.out.println("1 para  cons");
//	}
//	ese2prep(int x,String name){
//		System.out.println(name+x);
//		System.out.println("2 para  cons");
//	}
//	
//	public static void main(String[]args) {
//		ese2prep e=new ese2prep();
//	}
//}
/////// chaining overloading super()
//class Animal{
//	Animal(int x,String g){
//		System.out.println("animal cons");
//	}
//}
//public class ese2prep extends Animal{
////	ese2prep(){
////		this("sakshi");
////		System.out.println("default cons");
////	}
//	ese2prep(String name){
//		super(1,"g");
//		//this(1);
//		System.out.println("1 para  cons");
//	}
////	ese2prep(int x){
////		System.out.println(x);
////		System.out.println("2 para  cons");
////	}
//	
//	public static void main(String[]args) {
//		ese2prep e=new ese2prep("sakshi");
//	}
//}
// encapsulation always use public with getter setter 
//public class ese2prep{
//	private int age;
//	private String name;
//	public void setage(int x) {
//		age=x;
//		return;
//	}
//	public void setname(String name) {
//		this.name=name;
//	}
//	public void getage() {
//		System.out.println("age:"+age);
//	}
//	public void getname() {
//		System.out.println("name:"+name);
//	}
//	public static void main(String[]args) {
//		ese2prep e=new ese2prep();
//		e.setage(12);
//		e.getage();
//		e.setname("sakshi");
//		e.getname();
//	}
//}
////////////FunctionalInterface lambda exp.
/// 
//@FunctionalInterface
//interface myint{
//	int show(int x);
//	default void display() {
//		
//	}
//	static void my() {
//	
//	}
//	private void myz() {
//		
//	}
//	int x=10;
//}
//public class ese2prep{
//	
//	public static void main(String[]args) {
//	myint m=(int x)->x*x;
//	System.out.print(m.show(2));	
//		
//	}
//}
//////////////////
//@FunctionalInterface
//interface MO{
//	boolean n3(int n);
//	default void display() {
//		
//	}
//	static void my() {
//	
//	}
//	private void myz() {
//		
//	}
//	int x=10;
//}
//public class ese2prep{
//	
//	public static void main(String[]args) {
//	MO m=(x)->{
//		if(x>0)
//			return true;
//		else {return false;}
//	};
//	System.out.println(m.n3(-5.9));
//		
//	}
//}

///////////
//@FunctionalInterface  static 
//interface my{
//	int show(int x);
//}
//class np{
//	static int display(int x) {
//		System.out.println("display");
//		return 1;
//	}
//}
//public class ese2prep{
//	public static void main(String[]args) {
//		my o=np::display;
//		System.out.println(o.show(3));
//		
//	}
//}
//////////// particular object instance method reference 
//@FunctionalInterface   
//
//interface my{
//	int show(int x);
//}
//class np{
//	 int display(int x) {
//		System.out.println("display");
//		return 1;
//	}
//}
//public class ese2prep{
//	public static void main(String[]args) {
//		np n=new np();
//		my o=n::display;
//		System.out.println(o.show(3));
//		
//	}
//}
////////////// arbitrary object instance method reference 
//@FunctionalInterface   
//
//interface my{
//	int show(float x);
//}

//public class ese2prep{
//	public static void main(String[]args) {
////		np n=new np();
//		my o=Math::round;
//		System.out.println(o.show(3.90f));
//		
//	}
//}
///////////// constructor reference 
//@FunctionalInterface   
//
//interface my{
//	 np   show(int x);
//}
//class np{
//	 np(int x) {
//		System.out.println("display"+x);
//		
//	}
//}
//public class ese2prep{
//	public static void main(String[]args) {
////		np n=new np();
//		my o=np::new;
//		o.show(3);
//		
//	}
//}
//////////
//interface math{
//	String hello(String n);
//}
//class Greeter{
//	static String sayHello(String name) {
//		return name+"Say hello !!!!";
//	}
//}
//public class ese2prep{
//	public static void main(String[]args) {
//		math m=Greeter::sayHello;
//		System.out.println(m.hello("sakshi"));
//		
//	}
//}
////////////
//interface slen{
//	int slength(String name);
//}
//class np{
//	int slength(String name) {
//		return name.length();
//	}
//}
//public class ese2prep{
//	public static void main(String[]args) {
//		np m=new np();
//		slen s=m::slength;
//		System.out.println(s.slength("sacadskshi"));
//	}}
//////////////static method default private 
//interface myi{ 
//	
//	static void show() {
////		age(); private method must be static then correct 
//		System.out.println("show interface");
//	}
//	default void display() {
//		
//		System.out.println("dispolay interface");
//	}
//	private void age() {// cannot be assessed outside interface helper
//		//for other methods ,can't be overidden
////		private static void age() {
//		System.out.println("private interface");
//		return ;
//	}
//}
//public class ese2prep implements myi{
//public static void main(String[]args) {
//	ese2prep e=new ese2prep();
//	myi.show();// only call by the interface name not by object name 
//	e.display();
//}
//}
////////////forEach list set map method reference 
//import java.util.*;
//public class ese2prep {
//	static void display(int  name) {
//		System.out.println(name);
//	}
//	public static void main(String[]args) {
//		List<Integer>l=Arrays.asList(23,34,45,67);
//		l.forEach(n->System.out.println(n));
//		
//		HashMap<Integer,Integer>map=new HashMap<>();
//		map.put(1, 10);
//		map.put(2, 20);
//		map.put(3, 30);
//		map.forEach((key,value)->System.out.println(key +"@"+value));
//		
//		HashSet<Integer>hs=new HashSet<>();
//		hs.add(12);
//		hs.add(121);
//		hs.forEach(n->System.out.println(n));
//		l.forEach(ese2prep::display);// method reference 
//		l.forEach(n->{// can use condititon with forEach
//			if(n%2==0) {
//				System.out.println(n);
//			}
//		});
//		
//	
//	}
//	}
////////switch expression ,return value , save result in variable , no need of break
/// multi label switch case 1,2,3,4,5
/// yield keyword - when case block have multiple stmts 
//public class ese2prep {
//	public static void main(String[]args) {
//		int marks=3;
//		String result=switch(marks) {
//		case 12 ->"Fail";
//		case 34 ->"do better ";
//		case 89 ->"good";
//		default ->"satis";
//		};// remeber to put ; here in switch expression
//		System.out.println(result);
//		String result1=switch(marks) {
//		case 1,2,3,4 ->"weekdays";
//		case 5,6 ->"weekend";
//		default ->"nothing";
//		};
//		System.out.println(result1);
//		//in yield use : yield in every case block {}does not matter use or not
//		String r3=switch(marks) {
//		case 1 : System.out.println("1");
//		yield "one";
//		case 3 :{ System.out.println("2");
//		yield "two";}
//		default :
//			yield "def";
//		};
//	 System.out.println(r3);
//	 // text block always make sure that starting 3 double qoutes do not have
//	 //data content in that line gives error """ adad error 
//	String s=""" 
//			
//			nkn
//			bk
//			jkh
//			ojin
//			kjnhih """;
//}}
// //no use o=implements when use static mathod of interface bcz interfacename.method() is sufficient
//

///////////local variable type inference

//public class ese2prep {
//	static int dis() {
//		var r=90;
//		return r;
//	}
//	// it gives error return tyoe is not var
////	static var disg() {
////		var r=90;
////		return r;
////	}
//	public static void main(String[]args) {
//		int x=10;
//		var u=90;// method m
//		var im=true;// infers type of all
//		var k="sakshi";
//		System.out.println(u);
//		// var used in methods,for loop ,for each ,arrays,list,object,if condition,
//		for(var i=0;i<5;i++) {
//			System.out.println(i);
//		}
//		var arr= new int[5];
//		
//		for(var i:arr) {
//			System.out.println(i);
//		}
//		var obj=new ese2prep();
//		var list=Arrays.asList(1,2,3,4);
//		// not used var 
//		// var i;var i=null;var display;display(var i);static var i=2
//		System.out.println(ese2prep.dis());
//	}
//}
//////////
//sealed class mySealed permits car,bike,plane{
//	void dis() {
//		System.out.println("dis sealed class");
//	}
//}
//non-sealed class car extends mySealed{
//	void show() {
//		System.out.println("show non sealed class");
//	}
//}
//sealed class bike extends mySealed permits motorbike{
//	void bike() {
//		System.out.println("bike sealed class");
//	}
//}
//final class plane extends mySealed{
//	void plane() {
//		System.out.println("plane final class");
//	}
//}
//non-sealed class motorbike extends bike{
//	void motorbike() {
//		System.out.println("motorbike non sealed class");
//	}
//}
//
//
//record Student34(int ID,String name,String city) {}
//public class ese2prep {
//	public static void main(String[]args) {
//		// sealed class is a class which provide controlled inheritance , abstract class (can't instantiated)
//		// final cn't inherit ,restricted inhertance to specific class can extends
//		// sealed keyword ,permits
//		// always first extends then permits
//		mySealed my=new mySealed();
//		my.dis();
//		bike u=new bike();
//		plane ut=new  plane();
//		car uy=new car();
//		
//		motorbike uh=new motorbike();
//		u.bike();
//		ut.plane();
//		uy.show();
//		uh.motorbike();
//		Student34 s=new Student34(1,"sakshi","gzb");
//		System.out.println(s.name());
//		System.out.println(s.city());
//		//System.out.println(s.city); gives error must be like a method brackets()
//		System.out.println(s);
//		// gives oujtput in this form 
//		// Student34[ID=1, name=sakshi, city=gzb]
//		
//		
//		}
//	// can also put same method in all class 
//	// record - a compact way to store immutable data in classes , provid ein built hashcode ,constructor , toString,equals,getter
//		// reduce lines of code
//	// syntax record recordname(dataType field1,dataType field2....)
//	
//	// last topic notes 
//	/*ava Platform Module System (JPMS)
//Introduction
//The Java Module System was introduced in Java 9 and is also called JPMS (Java Platform Module System). It helps organize large Java applications into smaller, manageable units called modules.
//Before Modules
//Before Java 9, Java applications used:
//• JAR files
//• Classpath
//
//This caused problems such as:
//• Access to internal Java APIs which were not meant for public use
//• Classpath conflicts
//• Poor dependency management
//• Difficult to create scalable large applications
//• Hard to hide internal classes
//Solution: Java Modules
//Java introduced modules to solve these issues.
//
//Advantages:
//• Better security & maintainability
//• Strong encapsulation
//• Reliable configuration
//What is a Module?
//A module is a named, self-describing collection of packages.
//
//A module can contain:
//• Java packages
//• Classes
//• Interfaces
//• Resources
//Encapsulation in Modules
//Only exported packages are accessible outside the module.
//Internal packages remain hidden.
//
//Each module clearly declares:
//• dependencies
//• required modules
//• exported packages
//
//Hidden internal classes cannot be accessed directly.
//Applications become modular and easier to manage.
//Structure of a Module
//Every module contains:
//module-info.java
//
//This file is called the Module Descriptor File.
//Syntax of Module
//module moduleName {
//    // module directives
//}
//Checking Built-in Java Modules
//Run this command in CMD:
//java --list-modules
//exports Keyword
//exports means:
//“This package is visible to other modules.”
//
//Syntax:
//exports packageName;
//
//Example:
//module bank {
//    exports com.bank.service;
//}
//
//Meaning:
//• com.bank.service can be accessed by other modules.
//• Packages not exported remain hidden.
//
//This provides True Encapsulation.
//requires Keyword
//requires is used to declare dependency on another module.
//
//Syntax:
//requires moduleName;
//
//Meaning:
//• Current module depends on these modules.
//• Their classes can now be used.
//
//Without requires:
//• imported module classes are not allowed.
//Creating Modules in Eclipse
//Step 1: Create Two Java Projects
//• MyModuleApp
//• utils
//
//Step 2: Convert Both into Modular Projects
//Create module-info.java in both projects.
//
//Step 3: Create module-info.java
//
//module MyModuleApp {
//    exports com.myapp;
//}
//
//Meaning:
//• com.myapp is visible to other modules.
//
//Step 4: Create Packages Inside Modules
//Create packages and classes inside the modules.
//
//Step 5: Add Dependency Between Modules
//
//module MyModuleApp {
//    requires utils;
//    exports com.myapp;
//}
//
//Meaning:
//• MyModuleApp depends on utils.
//
//Add Module Dependency in Eclipse:
//1. Right-click project
//2. Properties
//3. Java Build Path
//4. Modulepath tab
//5. Click Add Project
//6. Select utils
//7. Apply → OK
//
//Step 6: Run the Module Program
//If module-info.java is correct and dependency is added properly, then the module program runs successfully.
//	*/
//}

/////////// unit 3
import java.util.*;
import java.util.Set;
import java.util.ArrayList;
import java.util.stream.*;// keep in mind stream s small h ,always use * 
import java.util.Arrays;
import java.util.stream.IntStream.*;// keep like stream.IntStream.*
class ese2prep{
	public static void main(String[]args){
		List<Integer>l=Arrays.asList(1,2,34,45,77,66,77);//list.stream()
		Stream s=l.stream();
		s.forEach(n->System.out.println(n));
		int[]arr= {1,2,34,5};
		IntStream is=Arrays.stream(arr);// IntStream Arrays.stream(arr)
		is.forEach(n->System.out.println(n));
		Stream st=Stream.of(12,23,56,75,4);// Stream.of
		st.forEach(n->System.out.println(n));
		l.stream().filter(n->n%2==0).forEach(n->System.out.println(n));// filter
		l.stream().map(n->Math.pow(n,2)).forEach(n->System.out.println(n));// map
		l.stream().map(n->Math.pow(n,2)).limit(2).forEach(n->System.out.println(n));//limit
		l.stream().map(n->Math.pow(n,2)).skip(2).forEach(n->System.out.println(n));//skip
		long c=l.stream().filter(n->n%2==0).count();//count
		System.out.println("n@@@@@@");
		l.stream().sorted().forEach(n->System.out.println(n));// sorted
		l.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		//l.stream().sorted(Comparator.comparing(n->n.length()).reversed()).forEach(n->System.out.println(n));
		System.out.println(c);
		l.stream().filter(n->n%2==0).distinct().forEach(n->System.out.println(n));// distinct()
		List<Integer>k=l.stream().collect(Collectors.toList());
		List<Integer>km=l.stream().toList();
		System.out.println(km);
		Set<Integer>kl=l.stream().collect(Collectors.toSet());
		System.out.println(kl);
		Integer[]arr1=l.stream().toArray(Integer[]::new);
		System.out.println(arr1);
		List<Integer>ak=l.stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(ak);
		Integer sd=l.stream().reduce(0,(sum,n)->{
			sum+=n;
			return sum;
		});
		System.out.println(sd);// reduce identity 
		Optional<Integer> sdi=l.stream().reduce((sum,n)->{
			sum+=n;
			return sum;
		});
		System.out.println(sdi);// reduce optional
		// remove optional 
		Integer si=l.stream().reduce((sum,n)->{
			sum+=n;
			return sum;
		}).get();
		System.out.println(si);
		//stream operation -collection,array,Stream.of
		// intermediate operation - reduce2,filter,map,sorted2,limit, skip, count ,distinct
		// terminal operation - toList,forEach,toSet,toArray,collect(collectors.toCollection),
		Integer[]ar=l.stream().toArray(Integer[]::new);
		Integer op=l.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(op);// max
		Integer opi=l.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(opi);// min
		
	}
}









