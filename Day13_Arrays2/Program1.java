public class Program1{

	public static void main(String[] args){
	
		//Till now we were doing declaration , construction and intialization on different line we can do that in single line as below : 

		int[] arr = {10,20,30,40};//Array of integers

		System.out.println(arr); //[I@...

		for(int i=0;i<=3;i++){
			System.out.print(arr[i] + " " );
		}
		//Output : 10 20 30 40
		System.out.println();//For new line

		//Creating String array

		String[] names = {"Sachin","Rushi","Shubham","Vijay"};
		System.out.println(names);//[Ljava.lang.String@....]

		//Creating float array
		float[] avg = {56.5f, 42.34f, 57.3f, 58.1f};
		System.out.println(avg);//[F



	}
}
