/*Iterative statements
  ++++++++++++++++++++
  while loop
	=> If we are not aware of how many time to iterate, then we need to go for while loop.
syntax:
	while(boolean){
	;;;;;;;;;
	}
eg:-
	while(resultSet.next()){
	;;;;
	;;;;
	}
	while(enumeration.hasMoreElements()){
	;;;;
	;;;;
	}
	while(itr.hasNext()){
	;;;;
	;;;;
	}

Note: The argument to a while statement should be of "boolean type".if we are using
anyother type it results in "CE".*/

public class Program1{
	
	public static void main(String[] args){
		
		/*eg#1.
		while (1)
		{
			System.out.printl("hello");//CE
		}*/

		/*eg#2.
		while (true)
		{
			System.out.printl("hello");
		}*/
		//output: hello(infinite times)
		
		/*eg#3.
		while (true)
		; */
		//Output: no output(valid)
		
		/*eg#4.
		/*while (true)
		int x= 10; //CE: delcaration not allowed */

		/*eg#5.
		while (true){
			int x1 =10; //valid
		}*/
		//eg#6.
		while (true)
		{
			int x2 =10;
		}
		System.out.println(x2);//CE: can't find symbol.
		//unreachable code
		//++++++++++++++++
		
		eg#1.
		while (true)
		{
			System.out.println("hello");
		}
		System.out.println("hiee");//CE: unreachable code
		
		eg#2
		while (false)
		{
			System.out.println("hello");//CE: unreachable code
		}
		System.out.println("hiee");
		
		//eg#3.
		/*int a1= 10;
		int b1= 20;
		while (a1<b1)//JVM :: 10<20 -> true
		{
			System.out.println("hello");
		}
		System.out.println("hiee");*/
		//Output: hello(infinite times)
		
		//eg#4.
		final int a2= 10;
		final int b2= 20;
		while (a2<b2)//JVM :: 10<20 -> true
		{
			System.out.println("hello");
		}
		System.out.println("hiee");//unreachable code
		//Output: CE

		//eg#5.
		final int a3= 10;
		while (a3<20)
		{
			System.out.println("hello");
		}
		System.out.println("hiee");//unreachable code
		//Output: CE
		
		/*eg#6.
		int a4= 10;
		while (a4<20)
		{
		System.out.println("hello");
		}
		System.out.println("hiee");*/
		//Output: hello(infinite times)
		
		/*Note::
			=> Every final variable will be replaced with corresponding value by the compiler
			=> if any operation involves only constants then compiler is responsible to perform operation.
			=> if any operation involves at least one variable, then compiler won't perform any operation, jvm will perform that operation.
		*/
	}
}