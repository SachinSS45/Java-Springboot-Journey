import java.util.Scanner; //importing because we need to take input from keyboard
class Farmer{
	
	//instance var
	float pi,si,t;

	//static var
	static float r; // rate of intrest

	//static block
	static{
		r = 2.5f;
	}

	//to take input from user for principal amount and time period
	public void input(){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal amount : ");
		pi = sc.nextFloat();
		
		System.out.println("Enter the time period : ");
		t = sc.nextFloat();
	}

	//now we need to calculate simple intrest
	public void calculateSI(){

		si = (pi*r*t)/100;
	}

	//we need to display SI amount
	public void displaySI(){
		System.out.println("SI IS : "+ si);
	}

}

public class Program5{
	
	//Main method (Entry point)
	public static void main(String[] args){

		Farmer f1 = new Farmer(); // It will call default contructor
		f1.input();
		f1.calculateSI();
		f1.displaySI();

		Farmer f2 = new Farmer();
		f2.input();
		f2.calculateSI();
		f2.displaySI();

	}
}
