//Here we will learn about instance control flow : instance var , instance block 

class Student{
	
	//instance variable
	int sid;
	String sname;
	int sage;

	//constructor : shadowing -> resolved using "this"
	Student(int sid, String sname, int sage){
	
		this.sid   = sid;
		this.sname = sname;
		this.sage  = sage;
	}
	
	//instance block   
	{
		sid = 100;
		sname = "dhoni";
		sage = 42;
	}
	//instance method
	public void dispStdDetails(){

		System.out.println("SID   is :: " + sid);
		System.out.println("SNAME is :: " + sname);
		System.out.println("SAGE  is :: " + sage);
	}

}
public class Program3{
	
	//main method (Entry Point)
	public static void main(String []args){

		Student s1 = new Student(10,"Sachin",23);
		s1.dispStdDetails();
	}
}
