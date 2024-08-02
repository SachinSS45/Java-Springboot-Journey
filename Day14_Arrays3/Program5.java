//Porgram to addition of 2 numbers by using command line arguments

public class Program5{

	public static void main(String[] args){

		int num1 = Integer.parseInt(args[0]);//We have to use wrapper class because we don't have any have to convert to String to int 
		int num2 = Integer.parseInt(args[1]);//It is calling parseInt() method by using class means parseInt() method is "Static"

		int result = num1 + num2;

		System.out.println("Sum = " + result);
	}
}
