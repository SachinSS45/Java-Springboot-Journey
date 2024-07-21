
public class Program3{
	
	public static void main(String[] args){

		int x1 = 10;
		int y1 = 20;

		switch(x1){

			case 10 : System.out.println(10);
			//case y1  : System.out.println(20); // Constant expression required in front of case 
		}

		//If we use final keyword infront of variable declaration then we use varaible name infront of case		
		//Ex : 2

		int x2 = 10;
		final int y2 = 20;

		switch(x2){
		 	
			case 10: System.out.println(10);
			case y2 : System.out.println(20);
		}
		//Here y is constant so we can use 'y' now infront of case 
		//if we don't use break anywhere inside switch all statement whichever present after matching case also will executed.
		//Output : 10 20

	}
}
