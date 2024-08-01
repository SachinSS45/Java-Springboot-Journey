//How to take input from user : By using Scanner class
import java.util.Scanner;//We are giving path of "Scanner" class because it is not present in current file and PWD(Present working directory)
public class Program5{

	public static void main(String[] args){

		int size = 0;
		System.out.print("Enter the size of array : ");

		Scanner sc = new Scanner(System.in); // We can take input from user by using Scanner class and "System.in" denotes Keyboard

		size = sc.nextInt(); //nextInt() is method of Scanner Class to take integer input

		//Declaration and Construction of Array

		int[] arr = new int[size];

		//Intialization of array
		
		for(int i = 0;i< arr.length ; i++){

			System.out.print("Enter the array value : ");
			arr[i] = sc.nextInt();
		}
		
		//To Itreate the array
		
		System.out.print("ONE-D Array Elements are : ");

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


