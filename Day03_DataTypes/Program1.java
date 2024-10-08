//Working on float data type

public class Program1{

	public static void main(String[] args){
		
		//Range : 1.4E-45 to 3.4028235E38
		//Compiler do typechecking
		//JVM Allocates memory of 4 bytes(32bits) on RAM.

		//float avg = 23.45; //CE : Incompatible types : possible lossy conversion from double to float
		
		//We must user prefix 'F' or 'f'
		float avg1 = 23.45f;
		float avg2 = 34.45F;

		//Now we are checking max value and min value of float

		System.out.println("MIN VALUE : " + Float.MIN_VALUE);
		System.out.println("MAX VALUE : " + Float.MAX_VALUE);

		//Trail and Error 

		float f1 = 12;//No Error  byte,short,int,long->float
		float f2 = 214748344353453650L; //No Error 
	}
