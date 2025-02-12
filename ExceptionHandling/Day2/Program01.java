//Compiler : Syntax Error
//JVM	   : RuntimeError or Exception

//Normal Termination : At the end nothing is present in stack
public class Program01{

	public static void main(String[] args){

		doStuff();
	}
	public static void doStuff(){
		doMoreStuff();
	}
	public static void doMoreStuff(){
		System.out.println("Hello");
	}
}
