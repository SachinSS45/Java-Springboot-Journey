/*Code is About : Customized Exception Handling ( Normal Termination ) for ArithmeticException
 *
 *
 *
 */
public class Program02{

	public static void main(String[] args){

		System.out.println("Statement-1");//Statement-1

		try{
			//risky Code
			System.out.println(10/0);//new ArithmeticException("/ by zero"); (Exception Object will be created)
		}catch(ArithmeticException e){
			//Handling Code
			System.out.println("Number is divided by 0");//Number is divided by 0
		}
		System.out.println("Statement-2");//Statement-2
	}
}

