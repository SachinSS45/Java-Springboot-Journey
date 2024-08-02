/* for-each loop in java : 
 * 	In for loop we need to do the initalization , condition and incre/dec . If one of them get done not properly then it will create lot of problem to resolve that we 
 * 	can use for-each loop.
 *
 * 	Syntax : 
 * 		for(datatype var : itreating object){
 * 			//Access the varaible directly
 * 		}
 *
 * 		We can use for each loop mainly for accessing only not for other purpose it will create problem
 * 
 */

public class Program6{

	public static void main(String[] args)[

		int[] arr = { 1, 2, 3, 4, 5};
		
		//for-each loop
		for(int data:arr){
			System.out.print(data + " ");//1 2 3 4 5
		}
		System.out.println();

		int[][] arr2 = { {10,20,30},{40,50},{60}};
		//for-each loop
		for(int[] oneDArr:arr2){

			for(int data : oneDArr){

				System.out.print(data + " ");
			}
		}

	}
}
