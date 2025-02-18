/* This code will tell about : 
 * when we are getting multiple exception then the exception we are getting the last one i.e recent will be handled by Default exception handler
 * here,we are getting both ArithmeticExceptiona and NullPointerException but the recent one is NullPointerException so it will handled by DEH
 * Note : In abnormal termination also finally block will execute.
 */

public class Program01{

	public static void main(String[] args){

		try{
			System.out.println(10/0);//new ArthemeticException("/ by zero");
		}catch(ArithmeticException e){
			System.out.println(10/0);//new ArithmeticException("/ by zero");
			System.out.println("Sachin");
		}finally{
			String s = null;
			System.out.println(s.length());//new NullPointerException();
		}
	}
}
