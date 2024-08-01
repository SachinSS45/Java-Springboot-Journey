//2-D Array : Array of Arrays
public class Program4{

	public static void main(String[] args){

		//Declaration of 2D Array

		int[][] arr = null;

		//Construction of 2D Array

		arr = new int[2][];

		//Intialization of 2D array     arr-> [ null , null ] 

		arr[0] = new int[4];//In first row there will be 4 coloumns
		arr[1] = new int[3];//3 Columns

		System.out.println(arr[0]);//[I@..
		System.out.println(arr[1]);//[I@..
		
		//Intialization values

		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;

		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;

		//To Itreate 

		for(int i=0;i<arr.length;i++){

			for(int j=0;j< arr[i].length;j++){

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		//Output : 10 20 30 40
		//	   50 60 70 
	}
}
