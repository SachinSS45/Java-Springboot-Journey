abstract class Person extends Object{

	int age;
	String name;
	static String collegeName = "SKNCOE PUNE";
	Person(int age,String name){
		System.out.println("In Person Constructor");
		this.age = age;
		this.name = name;
		System.out.println(this);
	}

	public void dispDetails(){
		System.out.println("Age : " + age);
		System.out.println("Name : "+ name);
	}

	
}

class Student extends Person{

	int rollNo;
	String address;

	Student(int age,String name,int rollNo,String address){
		
		super(age,name);
		System.out.println("In Student Constructor");
		this.rollNo = rollNo;
		this.address = address;
	}

	public  void dispDetails(){
		System.out.println("Name : " + name + " Age : " + age + " Roll Number : " + rollNo + " Address : " + address);
	}
}

public class Program5{

	public static void main(String[] args){

		Person p = new Student(23,"Sachin Shetkar",133,"Pune");
		p.dispDetails();
		System.out.println(Person.collegeName);
	}
}







