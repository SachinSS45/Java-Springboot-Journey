public class Program1{

	public static void main(String[] args){
		//Compiler -> Type Checking
		//Range : +127 to -128
		//JVM will allocate memory of 1 byte(8 bits) on RAM
		byte b = 10;
		
		//Finding max value of byte can store
		System.out.println("MAX VALUE : " + Byte.MAX_VALUE);//127
		//Finding min value of byte can store
		System.out.println("MIN VALUE : " + Byte.MIN_VALUE);//-128
		
		//If we try to store value greater than range it will give error 
		//byte b2 = 130;//Error : incompatiable types : possible lossy conversion from int to byte

		//byte b3 = 20.5;//Error : incompatiable types : possible lossy conversion from double to byte

		//byte b4 = "Sachin"; //Error : incompatible types : String can't be converted into byte

	}
}
