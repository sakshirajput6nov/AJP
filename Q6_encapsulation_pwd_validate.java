package Qspider;
// encapsulation
// interview - how to validate password
public class Q6_encapsulation_pwd_validate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap e=new encap("sakshi",11,20000,"sakshirajput11","Sakshi@12");
//		System.out.println(e.getAge());
//		e.setAge(100);
//		System.out.println(e.getAge());
//		System.out.println(e.getName());
//		e.setName("sak4");
//		System.out.println(e.getName());
//		e.setSalary(5000000);
		System.out.println(e.getSalary());
		
		
	}

}
class encap{
	private String name;
	private int age;
	private double salary;
	private String id;
	private String password;
	encap(String name,int age,double salary,String id,String password){
		this.name=name;
		//setName(name); // set using validate 
		this.age=age;
		this.salary=salary;
		this.id=id;
//		this.password=password;
		setPassword(password);
		//data hiding 
	}
	public int getAge() {
		// may have validation code 
		return age;
	}
	public double getSalary() {
		// may have validation code 
		return salary;
	}
	public String getName() {
		// may have validation code 
		return name;
	}
	public void setPassword(String password) {// important for interview validate password 
		if(password.length()<8 ) {
			System.out.println("invalid password input");
			return;
			
		}
		else {
			int upper=0,lower=0,digit=0,ch=0;// ch =special character
			for(int i=0;i<password.length();i++) {
				char c=password.charAt(i);
				if(c>='A'&& c<='Z') {
					upper++;
				}
				else if(c>='a'&& c<='z') {
					lower++;
				}
				else if(c>='1'&& c<='9') {
					digit++;
				}
				else {
					ch++;
				}
			}
			if(upper>0 && lower>0 && digit>0 && ch>0) {
				this.password=password;
			}
			else {
				System.out.println("invalid password entered");
			}
			
		}
		return;
	}
	public void setAge(int age) {
		if(age<=18 && age <65) {
			this.age=age;
		}
		else {
			System.out.println("invalid input");
		}
	}
	public void setSalary(double salary) {
		if(salary>10000 && salary<100000) {
			this.salary=salary;
		}
		else {
			System.out.println("invalid input");
		}
	}
	public void setName(String name) {
		int len=name.length();
		if(len>=3 && len<=50 && name.isBlank()==false && name.matches("[A-Za-z\s]+")) {// regular expression
			// [ means OR , + means any no. of times ,like [2,4]only these length,() AND
			// email vallidate - learn regular exp.
			this.name=name;
		}
		else {
			System.out.println("invalid input");
		}
	}
	public void setId(String id) {
		int len=id.length();
		if(len>=3 && len<=50 && name.isBlank()==false && name.matches("[\\w\s.-]+")) {
			this.id=id;
		}
		else {
			System.out.println("invalid input");
		}
	}
	public String getId() {
		return id;
	}
	
}
