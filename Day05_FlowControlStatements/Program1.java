/*if block
========
To select some statements for execution based on condition,we use if block
syntax::
        if(boolean)
        {
		//statement-1
		//statement-2
		//statement-3
        }
	statement-4
workflow
=======
	boolean condition true means statement-1,2,3 will be executed otherwise statement-4 will be executed.
Note:
        1. If we are writing only one statement inside if block, then cury braces are optional.
	2. When we write if,else block is also optional.
        3. only one statement inside if block,curly braces are optional and that one statement should never be a declarative statement.
	4. If we are writing declarative statement inside if block with curly braces that variable scope is limited to only if block.
	5. Nesting of if-else[else-if ladder] is not prefered in coding.
*/

public class Program1{

	public static void main(String[] args){

		//Ex : 1
		/*int x1 = 0;
		if(x1){
			System.out.println(x1);//CE : Incompaitable types :int can't be converted into boolean
		}*/

		//Ex : 2
		int x2 = 0;
		if(x2==0){
			System.out.println(x2);//Output : 0
		}

		//Ex:3
		boolean res = false;
		if(res){  //condition fail because boolean value is false
			System.out.println(res);
		}
		//Output : No Output

		//Ex : 4
		boolean res2 = false;
		if(res=true){ //res->true
			System.out.println(res);
		}
		//Output : true

		//Ex : 5
		if(true)
			System.out.println("hello");//Curly braces are optional if we are writing only one statement inside if
		System.out.println("Hiee");
		//Output : hello
		//         Hiee

		//Ex : 6 
		if(true); // No Error
		if(false); //No Error
		if(true) System.out.println("hello"); //Output : hello


		//Ex : 7 (Not valid cases)

		//if(true) int x = 10; //CE : Variable declaration not valid
		//if(true){ int x = 10;} System.out.println(x);//Can't find symobol 'x'
	
		//Ex : 8 (if we use curly while declaration then there is no error
		if(true){int x = 10;}
	
		//Ex : 9
		/*if(true)
			System.out.println("Sachin");
			System.out.println("Shetkar");
		else  // CE : else without if
			System.out.println("Java 8");
		*/
		//We can't write else statement without if (above example we haven't used curly braces that's why we got the error
	}
}
