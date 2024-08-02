//We will learn about "Command Line Argument in Java"
/*
 *1) When you are passing "Arguments" on command line is called "Command Line Arguments"
 *2) When you are passing the arguments from command line it will use "Anonymous Array" while calling main method
 	Ex : 
		java Program4
		*Internally : JVM will do : java.main(new String[]{}); //We can create 0 length array in java

		java Program4 Sachin Ramesh Tendulkar
		-> java.main(new String[]{"Sachin","Ramesh","Tendulkar"}

*/
public class Program4{

	public static void main(String[] args){

		System.out.println(args.length);//0 (if we don't pass any argument from command line)
		/* // java Program4 Sachin Ramesh Tendulkar 
		System.out.println(args[0]);//Sachin
		System.out.println(args[1]);//Ramesh
		System.out.println(args[2]);//Tendulkar */
					    
		//Itreating through for-each loop

		for(String data : args){
			System.out.print(data + " ");
		}
	}
}

