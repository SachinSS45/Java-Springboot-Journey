public class Program2{

	public static void main(String[] args){
		//Compiler -> Type Checking
		//Range : +32767 to -32768
		//JVM will allocate memory of 2 byte(16 bits) on RAM
		short s = 130;
		
		//Finding max value of byte can store
		System.out.println("MAX VALUE : " + Short.MAX_VALUE);//32767
		//Finding min value of byte can store
		System.out.println("MIN VALUE : " + Short.MIN_VALUE);//-32768
		
		//If we try to store value greater than range it will give error 
		//short s2 = 32768;//Error : incompatiable types : possible lossy conversion from int to short

		//short s3 = 20.5;//Error : incompatiable types : possible lossy conversion from double to short

		//short s4 = "Sachin"; //Error : incompatible types : String can't be converted into short

	}
}
