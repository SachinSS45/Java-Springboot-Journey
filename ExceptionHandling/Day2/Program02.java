//Compiler : Syntax Error
//JVM	   : RuntimeError or Exception

//Abnormal Termination : Exception comes at "10/0"
public class Program02{

	public static void main(String[] args){

		doStuff();
	}
	public static void doStuff(){
		doMoreStuff();
	}
	public static void doMoreStuff(){
		System.out.println(10/0);//Runtime Exception : Handled by Default Exception Handler
	}
}

/*
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Program02.doMoreStuff(Program02.java:15)
        at Program02.doStuff(Program02.java:12)
        at Program02.main(Program02.java:9)
*/
