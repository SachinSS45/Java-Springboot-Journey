/*
 * Polymorphism : (Overloading)
 *   - Two or more methods are said to be overloaded methods if they have same method name but
 *     change in argument types ( method signature )
 *   - In c lang have we don't have overloading concept so as a C programmer for same tasks with
 *     diffrent arg types, programmer should remember multiple method names.
 *   - Remembering mutliple method names was challenging for developers
 *   - In java we have concept of overloading
 *   - where we can write one method name for same tasks with diffrent args types.
 *   - Overloading concept reduces complexity of programming in java
 *   - Overloading refers to "Compile Time Polymorphism" or "Method Overloading".
 */

class Calculator{

	public void add(int a, int b){
		System.out.println(a + b);
	}
	
	public void add(int a, int b, int c){
		System.out.println(a + b + c);
	}
	
	public void add(double a, double b){
		System.out.println(a + b);
	}
	
	public void add(float a, float b){
		System.out.println(a + b);
	}
}

public class Polymorphism{

	public static void main(String[] args){

		Calculator c = new Calculator();
		c.add(10, 20);//30
		c.add(10,20,30);//60
		c.add(25.5,35.5);//61
		c.add(35.5f,36.5f);//72
	}
}
