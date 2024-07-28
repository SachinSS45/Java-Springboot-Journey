
public class Introduction{

	public static void main(String[] args){

		
		int[] arr = null; //Declaration of array

		arr = new int[5];//Array Construction
		
		//by default JVM will give value as 'zero' to every data because it is created at heap area

		System.out.println("Array before initialization : ");
		for(int i=0;i<=4;i++){
			System.out.println(arr[i]);
		}
		//Output : 0 0 0 0 0

		//We will initialize array with values

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println("Array after initialization : ");

		for(int i=0;i<=4;i++){
			System.out.println(arr[i]);
		}

		//Output : 10 20 30 40 50 
	}
}
