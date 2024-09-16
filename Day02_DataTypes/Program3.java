public class Program3{

	public static void main(String[] args){
		//Compiler -> Type Checking
		//Range : -2147483648 to -2147483647
		//JVM will allocate memory of 4 byte(32 bits) on RAM
		int num = 32768;
		
		//Finding max value of int can store
		System.out.println("MAX VALUE : " + Integer.MAX_VALUE);//2147483647
		//Finding min value of int can store
		System.out.println("MIN VALUE : " + Integer.MIN_VALUE);//-2147483648
		
		//If we try to store value greater than range it will give error 
		//int s2 = 3276833443443;//Error : Integer number is too large 

		//int s3 = 20.5;//Error : incompatiable types : possible lossy conversion from double to int

		//int s4 = "Sachin"; //Error : incompatible types : String can't be converted into int

	}
}
