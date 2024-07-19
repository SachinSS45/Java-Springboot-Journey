/* Typecasting mainly divided into two types : Implicit Typecasting and Explicit Typecasting
 
  1)Implicit Typecasting : 
  	The process of converting data from lower data type to higher data type it is called as "Implicit Typecasting " OR "Widening"
 
  	Rules : 
  		byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
  					|
  					Char(2)
	  Rule 1 : We can store int value in char but not byte and short
	  	  Ex 1: int a = 65;
		        char ch = a; // No Error
		        s.o.p(ch)//A
		  Ex 2 : short/byte a = 65;
		  	 char ch = a;//CE : Incompaitable types : short/byte can't be converted to char
			//We can typecasting explicitly
	  Rule 2 : 
	  		byte + byte -> int
			byte + short -> int
			short + int -> int
		**      long + float -> float
			float + double -> double
			long + double -> double
			int + long -> long
			int + int -> int
			int + double -> double
   2)Explicit Typecasting(Narrowing) : 
   	-The process of converting higher data type to lower data is called is explicit typecasting
	-It should be done by Programmer 
	Syntax : P a = (Q) b ; 
		 => P and Q should be primitive type and from Q to p there should be implicit relationship

		Ex 1: int a = 10;
		     byte b = (byte) a ;
		     s.o.p(b)//10

	    **  Ex 2 :byte b1 = 10;
	    	      byte b2 = 20;
		      byte ans = (byte)(b1 + b2); //Both brackets are compulsory

		Ex 3 : int a = 130;
		       byte b = (byte)b;
		       s.o.p(b);//-126
		***Formula : For Round Off ****
		data = minRange + (Result - maxRange - 1)
		i.e  here for byte minRange = -128 and maxRange = +127 
		     = -128   + (130 - 127 - 1) = -128 + 2 = -126
*/
public class Program2{

	public static void main(String[] args){
		//1 : converting int to long (Implicitly possible)
		System.out.println("Program 1 Output : ");
		int i1 = 10;

		long l1 = i1;

		System.out.println(l1);//10

		//2 : Storing int value in char (Implicitly possible)
		System.out.println("Program 2 Output : ");
		char c1 = 100;
		System.out.println(c1);//d 
		int i2 = c1;
		System.out.println(i2);//100 

		//3 : We can't long in int : Incompaitable types : possible lossy conversion from long to int
		System.out.println("Program 3 Output : ");
		long l2 = 10;
		//int i3 = l2;//CE
		//Explicitly we can do
		int i3 = (int)l2;
		System.out.println(i3);//10 

		//4 : Simillarly we can't put int value in byte and short  implicitly CE
		System.out.println("Program 4 Output : ");
		int i4 = 10;
		//short s1 = i4;//CE : Possible lossy conversion from int to short
		short s1 = (short)i4;
		System.out.println(s1);//10 
				      
		//Imp 5 : Note : byte and short internel representation is not compaitable to convert into char 				implicitly we can do explicitly.
		System.out.println("Program 5 Output : ");
		byte b1 = 65;
		//char c2 = b1;CE
		char c2 = (char)b1;
		System.out.println(c2);//A

		char c3 = 'A';
		//short s2 = c3;//CE
		short s2 = (short)c3;
		System.out.println(s2);//65 

		//6 : char is compaitable to int directly no need of typecasting explicitly but viceversa not
		System.out.println("Program 6 Output : ");
		char c4 = 'A';
		int i5 = c4; 
		System.out.println(i5);//65
		int i6 = 65;
		char c5 = (char)i6;
		System.out.println(c5);//A
		char c6 = 97;
		System.out.println(c6);//a 

		//7 : byte + byte = int implicitly 
		System.out.println("Program 7 Output : ");
		byte b2 = 60;
		byte b3 = 50;
		//byte result = b2 + b3 ; //CE : int to byte (byte + byte == int )
		//byte result = (byte)b2 + b3; //CE : it will convert only b2 into byte but not for 'b1 + b2'
		byte result = (byte)(b2+b3);//No Error
		System.out.println("Result = " + result);//110 

		//8 : We can use multiple typecasting data types but first one should be compaitable
		System.out.println("Program 8 Output : ");
		double d1 = 22.3;
		//byte b4 = (short)(float)d1;//CE : Possible lossy conversion from short to byte
		byte b4 = (byte)(short)(float)d1;
		System.out.println(b4);//22

	


	}
}
