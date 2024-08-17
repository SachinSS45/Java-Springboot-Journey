/* Instance Varaibles : 
 * 	- These are the varaibles which are written inside the class outside the method
 * 	- These are the varaibles whose value changes from object to object
 * 	- Instance varaibles are created at the time of object creation and destroyed at the time of object destructio		n by GarbageCollector
 * 	- Instance varaibles are stored inside the heap area of object.
 * 	- Instance varaibles can be accessed from instance area.
 * 	- Instance area is nothing but body of instance method.
 * 	- Separte memory will be given to every object of instance varaibles.
 * 	- Instance varaibles can be accessed inside instance method
 * 	- Inside static method the body is static area where to access instance varaibles you need reference directly
 	  you can't access.
 */
class Student{
	
	//instance varaibles
	String name;
	int age;
	char gender;

	//instance method
	void dispStdDetails(){

		System.out.println("Name is : " + name);
		System.out.println("Age is : " + age);
		System.out.println("Gender is : " + gender);
	}
}

public class InstanceVaraible{

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
	}
}
