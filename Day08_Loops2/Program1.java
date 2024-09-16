//do-while loop
/*
+++++++++++++
do-while loop
+++++++++++++
	if we want to execute the body of the loop atleast once then we need to go for dowhile loop.
Syntax:
do{
;;;;;
;;;;;
;;;;;
}while(boolean); // ; is mandatory
Conclusion : 
a. curly braces are optional
b. Without curly braces we can take only one statement and that statement should never be declarative statement.
*/
public class Program1{

	public static void main(String[] args){

		//Eg : 1
		/*do{
			System.out.println("hello");
		}while(true); */

		//Output : hello infinte times

		//Eg : 2
		do
			;
		while(false); //Compilation Sucessful

		//Eg : 3
		/*do
			int x = 10; //Variable declaration not allowed here
		while(false);*/
		//if we are writing do-while loop without curly braces then one statement not be declarative statement 
		
		//Eg : 4
		/*do{
			int x1 = 10;
		}while(true);*/
		//Compilation Sucessfull

		//Eg : 5
		/*do while(true) System.out.println("Hello"); while(true);*/ // Infinite times it will print "Hello"
		
		//Eg : 6
		//do while(true); // No Error

		//Eg : 7
		/*do{
			System.out.println("Sachin");
		}while(true);
		System.out.println("Dhoni"); *///CE : Unreachable Statement 
		
		//Eg : 8 
		do{
			System.out.println("Sachin");
		}while(false);
		System.out.println("Dhoni"); 
		//Output : Sachin Dhoni

		//Eg : 9 
		/*int a = 10 , b = 20;
		do{
			System.out.println("Sachin");
		}while(a<b);
		System.out.println("Dhoni");*/ //Output : Sachin (infinite times)
		
		//Eg : 10
		int a1 = 10 , b1 = 20;
		do{
			System.out.println("Sachin");
		}while(a1>b1);
		System.out.println("Dhoni"); //Output : Sachin Dhoni
		
		//Eg : 11
		/*final int a2 = 10 , b2 = 20;
		do{
			System.out.println("Sachin");
		}while(a2 < b2); // here a and b are compile time constant so if this condition is becoming every time true then for below lines it will give error
		System.out.println("Dhoni");*/ //CE : Unreachable statment
		
		//Eg : 12
		final int a2 = 10 , b2 = 20;
		do{
			System.out.println("Sachin");
		}while(a2 > b2); // here a and b are compile time constant and it is false every time so there will no error
		System.out.println("Dhoni"); //Output : Sachin Dhoni
	}
}
