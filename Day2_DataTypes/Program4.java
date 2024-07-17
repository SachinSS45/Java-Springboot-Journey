public class Program4{

	public static void main(String[] args){
		//Compiler -> Type Checking
		//Range : -9223372036854775808  to +9223372026854775807
		//JVM will allocate memory of 8 byte(64 bits) on RAM
		long num = 32768;//No Error 
		//long num2 = 2147483649; // Error : integer number is too large
		long num3 = 2147483649L; //We must use 'l' or 'L' prefix to store number greater than int range 
		
		//Finding max value of long can store
		System.out.println("MAX VALUE : " + Long.MAX_VALUE);
		//Finding min value of long can store
		System.out.println("MIN VALUE : " + Long.MIN_VALUE);
		

		//long s3 = 20.5;//Error : incompatiable types : possible lossy conversion from double to long

		//long s4 = "Sachin"; //Error : incompatible types : String can't be converted into long

	}
}
