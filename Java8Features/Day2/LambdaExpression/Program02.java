/* In this code we will learn about : How we can use lambda expression to create thread by using Runnable .
 * We know that Runnable is FunctionalInterface with abstract method run()
 */

//Traditional Approch (We need to implement Runnable interface)
class MyRunnable implements Runnable{

	@Override
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("Child Thread");
		}
	}
}
public class Program02{

	public static void main(String[] args){
		//Traditional Approch
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		for(int i=1;i<=10;i++){
			System.out.println("main thread");
		}
		System.out.println();

		//Now by using lambda expression : We know Runnable is functional interface so we can use lambda expression to implement body
		//No need to create MyRunnable class
		//Interface called Runnable run()::void
		//Binding Lambda Expression

		Runnable r1 = ()->
		{
			for(int i=1;i<=10;i++){
				System.out.println("Child Thread");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
