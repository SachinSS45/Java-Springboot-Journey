/*Code is About : Methods we can apply on Exception Object
 *1) printStackTrace() : Used For Printing Name , Decription , and Location Of Exception
 *2) toString() : Used for printing Name and Description
 *3) getMessage() : Used for printing only Description
 */
public class Program03{

	public static void main(String[] args){

		System.out.println("Start main");

		try{
			//risky code
			//new ArithmeticException("/ by zero")
			System.out.println(10/0);
		}catch(ArithmeticException e){
			//Handling Code
			System.out.println("Name , Description and Location");
			e.printStackTrace();
			System.out.println("Name and Description : " + e.toString());
			System.out.println("Only Description i.e Cause : " + e.getMessage());
		}

		System.out.println("End Main");

	}
}
/*
 Start main
Name , Description and Location
java.lang.ArithmeticException: / by zero
        at Program03.main(Program03.java:15)
Name and Description : java.lang.ArithmeticException: / by zero
Only Description i.e Cause : / by zero
End Main

*/
