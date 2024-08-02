/* We will learn how we can pass array reference to method */

public class Program2{

	public static void main(String[] args){

		int[] arr = new int[]{10,20,30,40,50};

		int total = sum(arr);//Passing array by reference : call by reference if we do changes in method it will fetch in original array also.

		System.out.println("The sum is : " + total);

	}

	static int sum(int[] arr){
		int total = 0;
		for(int data : arr){
			total += data;
		}
		return total;
	}
	
}
