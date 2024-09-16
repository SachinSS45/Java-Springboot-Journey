//Working on double data type

public class Program2{

	public static void main(String[] args){

		//Complier do typechecking
		//JVM allocates memory of 8 bytes (64bits) on RAM

		double d2 = 32142.23; //By default it is double
		double d3 = 234.3434d; // We can use prefix 'd' or 'D'
		double d4 = 23432.3443D;

		System.out.println("MIN VALUE : " + Double.MIN_VALUE);
		System.out.println("MAX VALUE : " + Double.MAX_VALUE);

		//Trail and Error

		double d5 = 234324; // byte,short,int,long -> double
		double d6 = 2342342342343L;
		double d7 = 234.34F; //float -> double
		double d8 = 'A';     // char -> double
		double d9 = true; //CE : incompaitable types : boolean can't be converted into double
		//Therefore all datatypes expect boolean double can store there value.
	}
}
