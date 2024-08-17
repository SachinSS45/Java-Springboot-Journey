/* Instance Varaibles : 
 * 	- These are the varaibles which are written inside the class outside the method with an access modifier is called "static"
 * 	- These are the varaibles whose value doesn't changes from object to object
 * 	- static varaibles are created at the time of loading .class file and destroyed at the time of unloading .classFile
 * 	- Instance varaibles are stored inside MethodArea[common copy for all objects of the class]
 * 	- static varaibles can be accessed from instance area or static area 
 * 	- Inside static method the body is static area.
 */
class Student{
	
	//instance varaibles
	String name;
	int age;
	char gender;
	
	//static varaible
	static String nationality = "India";
	
	//instance method
	void dispStdDetails(){

		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Gender is : " + gender);
		System.out.println("Nationality is : " + nationality);
	}
	//static method
	public static void dispNationality(){
		System.out.println(nationality);//static area
	}
}

public class StaticVaraible{

	public static void main(String[] args){

		//Creation of object 
		Student s1 = new Student();
		s1.name = "Sachin";
		s1.age = 23;
		s1.gender = 'M';

		//Calling instance method : dispStdDetails()
		s1.dispStdDetails();

		//Creation of object 
		Student s2 = new Student();
		s2.name = "Rushi";
		s2.age = 27;
		s2.gender = 'M';
		
		//Calling instance method : dispStdDetails()
		s2.dispStdDetails();

		System.out.println("******************Static Area*****************");
		System.out.println("Nationality for all students is " + Student.nationality);//India
		System.out.println("Nationality for s1 : " + s1.nationality);//India
		System.out.println("Nationality for s2 : " + s2.nationality);//India
	}
}
