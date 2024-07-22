//Fallthrough in switch : within in a switch , if any case matched from that onwards, all the statements will be executed until the end of the switch or break . This is called "fallthrough in switch". ** The main advantage of fallthrough inside switch is we can define common actions for multiple cases.

public class Program6{

	public static void main(String[] args){

		int x = 0;

		switch(x){

			case 0: System.out.println("0");
			case 1: System.out.println("1");
			case 2: System.out.println("2");
			default : System.out.println("default");
		}
		//Will execute all statements till it get break or end of switch.

		/* Output : 0 
		 	    1
			    2
			    default 
		*/
		switch(x){

			case 0: System.out.println("0");
			case 1: System.out.println("1");
				break;
			case 2: System.out.println("2");
			default : System.out.println("default");
		}
		/* output : if x = 0  ,   if x = 1  , if x = 2   . if x = 3
		  	    0		     1	      2		      default
		  	    1			      default
		 */
		switch(x){
			default : System.out.println("Default");
			case 0: System.out.println("0");
			case 1: System.out.println("1");
				break;
			case 2: System.out.println("2");
		}
		// Output : //Even though default block at first line it will execute at last
		// if x = 0  O/p : 0 1
		// if x = 1  O/p : 1
		// if x = 2  O/p : 2
		// if x = 3  O/p : Default 0 1 

		switch(x){
			case 0:System.out.println("0");
			default : System.out.println("Default");
			case 1 : System.out.println("1");
		} // We can write default label anywhere inside switch but we can't write more than once
		// Output : 0 Default 1

		
		switch(x){
			default : System.out.println("Default - 1");
			case 0: System.out.println("0");
			case 1: System.out.println("1");
				break;
			case 2: System.out.println("2");
			default : System.out.println("Default - 2");
		}
			

		
	}
}
