/* This code will tell about : 
 * How we can tackle Checked Exception : 1)Try and Catch 2)throws[Working with checkedException]
 * If you don't tackle/handle it will give CE : 
 * Program03.java:11: error: unreported exception InterruptedException; must be caught or declared to be thrown
                Thread.sleep(1000);
                            ^
 *
 */

public class Program03{

	public static void main(String[] args)throws InterruptedException{
		
		for(int i=1;i<=10;i++){
			Thread.sleep(1000);
			System.out.println("Roll No : " + i);
		}
	}
}
