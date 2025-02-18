/* This code will tell about : Can we throw Exception without creating it's object? No 
 * It will give us NullPointerException at runtime.
 */

public class Program02{
	
	static ArithmeticException e;//Program02.e=null internally and we are trying to access null value i.e why it will give NullPointerException
	public static void main(String[] args){
		
		throw e;
	}
}
/* At Runtime : 
 * Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "Program02.e" is null
        at Program02.main(Program02.java:12)
*/
