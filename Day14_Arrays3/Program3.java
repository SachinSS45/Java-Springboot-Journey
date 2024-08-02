/* We will learn about the "Anonymous Array in Java"  */

/* 1) When we have to use "Anonymous Array" ? 
 * -> If you want to use array for particular instance only we can't reuse that 
 *
 * An array without name is called as "Anonymous Array"i
 *
 * Creation of Anonymous Array : 
 * 	new int[]{10, 20, 30, 40};
 * 	new String[]{"Sachin", "Subramanyam", "Vijay"};
 *	new int[][]{{10,20,30},{40,50},{60}};
 */

public class Program2{

	public static void main(String[] args){

		System.out.println("The sum is : " + sum(new int[]{10,20,30,40,50});//Created the anonymous array and passed in the method we can't use this array again anywhere
	}

	static int sum(int[] arr){
		int total = 0;
		for(int data : arr){
			total += data;
		}
		return total;
	}
	
}
