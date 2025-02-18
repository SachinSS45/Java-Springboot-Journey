/* This code will tell about : 
 * If checked exception occurs it should be handled or declared to be thrown
 *
 *
 */

public class Program04{

	public static void main(String[] args)throws InterruptedException{

		doStuff();
	}

	public static void doStuff()throws InterruptedException{
		doMoreStuff();
	}
	public static void doMoreStuff() throws InterruptedException{ //throwing to caller
		Thread.sleep(1000);//checked exception method call
	}
}
