//Switch argument and case label can be expression but case label must be constant expression

public class Program4{

	public static void main(String[] args){
		
		//Ex : 1
		int x = 10;

		switch(x+1){ // No Error : We can use dynamic expression in switch

			case 10:
			case 10 + 20:
			case 10 + 20 + 30: // all three are constant expression
		}

		//Ex : 2
		//Case label value should be lie in range of switch argument type , otherwise it results in "CompileTimeError"
		byte b = 10;

		switch(b+1){
			case 10: System.out.println(10);
			case 100: System.out.println(100);
			case 1000: System.out.println(1000);//You can think why it is not giving error reason behind this is 'b + 1' => byte + int => int therefore 1000 is in range of int . If instead of 'b+1' if there wasonly 'b' then it will give error (incompaitible types from int to byte) 
		}
	}
}
