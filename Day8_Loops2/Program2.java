/* 
forloop
======
It is one of the most commonly used loop and best suitable if we know the no of iterations in advanced.
Syntax::
for(initialisation;condition;incr/dec)
{
//body of loop
}
Note: curly braces are optional, we can take only one statement and that statement should not be declarative.
*/

public class Program1{

	public static void main(String[] args){

		//Eg : 1
		int i = 0;
		for(System.out.println("Hello");i<3;System.out.println("Hi")){
			i++;
		}
		//Output : 	Hello Hi Hi Hi
		
		//Eg : 2
		//By default condition kept as true by compiler
		/*for( ; ; ){
			System.out.println("hello"); */
		//Output : hello (infinite times)
		
		//Eg : 3
		for( ; ; )
			int x = 10; //CE : Varaible declarations not allowed here
		
		//Eg : 4
		for( ; ; ){
			int x2 = 10;
		}//Output :: No Output
		
		//Eg : 5
		/*for(int i=0;i<true;i++){ // i < true bad operand types for binary operator '<'
			System.out.println("Sachin");
		}
		System.out.println("Dhoni");*/
		//Output :: CE : Bad operand type for binary operator '<'
		
		//Eg : 6 
		/*for(int i=0;i<false;i++){ // i < false bad operand types for binary operator '<'
			System.out.println("Sachin");
		}
		System.out.println("Dhoni");*/
		//Output :: CE : Bad operand type for binary operator '<'

		//Eg : 7 
		/*for(int i=0; ;i++){
			System.out.println("Sachin");
		}
		System.out.println("Dhoni"); */ //CE : Unreachable statement  
		
		//Eg : 8
		/*int a=10,b=20;
		for(int i=0;a<b;i++){
			System.out.println("Sachin");
		}
		System.out.println("Dhoni");*/
		//Output : Sachin (Infinite Times) because a and b will get memory at runtime by JVM

		//Eg : 9 
		/*final int a = 10,b = 20;// a & b compile time constant
		for(int i=0;a<b;i++){
			System.out.println("Sachin");
		}
		System.out.println("Dhoni");*///CE : Unreachable statement

		
		
		
	}
}
