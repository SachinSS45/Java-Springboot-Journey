/*Code is About : In multiple catch there should maintain order at top child should present at down parent should be present otherwise CE
 *
 *
 *
 */
public class Program04{

	public static void main(String[] args){

		try{
			System.out.println(10/0);
		}
		/*catch(Exception e){
			//handling code w.r.t Genric Statements
			e.printStackTrace();
		}catch(ArithmeticException ae){
			//handling code wrt Arithmetic Operations
			ae.printStackTrace();
		}*/
		/* CE : Program04.java:16: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException ae){
		*/
		catch(ArithmeticException ae){
			ae.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	/*java.lang.ArithmeticException: / by zero
        at Program04.main(Program04.java:11)*/	
	}
}
