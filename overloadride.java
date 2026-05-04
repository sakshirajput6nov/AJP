package javaclasspack;
class class1{
	void display() {
		System.out.println("my class 1 display  method no arg");
	}
	void display(int a) {
		System.out.println("my class 1 display method 1 arg");
	}
	
}

public class overloadride extends class1 {
	void display() {
		System.out.println("my overloadride class display  method no arg");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloadride o=new overloadride();
		o.display();
		o.display(2);
	}

}
