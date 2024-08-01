public class Program3{

	public static void main(String[] args){

		double d = 35.6;
		//float f = d;//CE : incompaitable types : from double to float

		int num = 30;
		long l = num;

		char ch = 'A';
		int val = ch;

		char[] carr = {'s','a','c','h','i','n'};

		//int[] iarr = carr;
		
		int[] iarr = {1,2,3,4,5};
		//carr = iarr;

		short[] sarr = {1,2,3,4};
		//iarr = sarr;//In array type promotion not possible for primitive type
		
		//For reference type promotion possible parent child relation

		String[] data = {"Sachin","Rushi"};

		Object[] objArr = data;

		System.out.println(objArr.toString());

		int[] a = {10, 20, 30 ,40 , 50,60,50};
		int[] b = {80, 90};
		a = b;
		b = a;
		//To do assignment only type should match not the length
		for(int i=0;i<a.length;i++)
			System.out.println(a[i] + " " + b[i]);
		//Output : 80 80 
		//	   90 90
	}
}
