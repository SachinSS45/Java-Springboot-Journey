public class Program1{

	public static void main(String[] args){

		int[] arr = new int['A']; // arr is int array which size has 65 (No Error)
		System.out.println(arr.length);//65
		arr[0] = 10;

		byte b = 65;
		int[] a = new int[b];
		System.out.println(a.length);//65

		short s = 40;
		arr = new int[s];
		System.out.println(arr.length);//40
		System.out.println(arr[0]);

		/*arr = new int[5L];//CE
		arr = new int[5.4f];//CE
		arr = new int[5.5];//CE 
		*/ 
		//The allowed datatypes to sepcify the size are byte,short,int,char

		//Rule : The maximum allowed array size in java is max value of int size
		//int[] arr2 = new int[Integer.MAX_VALUE];//No CE Error //But at runtime it will give OutOfMemoryError due to heap is full
		

	}
}
