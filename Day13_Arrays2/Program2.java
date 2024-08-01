public class Program2{

	public static void main(String[] args){

		//Array Element Assignments

		int[] arr = new int[10];

		arr[0] = 97;
		arr[1] = 'a';

		byte b = 10;
		arr[2] = b;

		short s = 35;
		arr[3] = s;

		/*long l = 345L;
		arr[4] = l;//CE : Incompaitable types */

		//For float array

		float[] farr = new float[10];
		//we can keep byte,short,char,int,long,float values in float array
		
		farr[0] = 34.5f;
		farr[1] = b;
		farr[2] = s;
		farr[3] = 234;
		farr[4] = 'A';
		farr[5] = 30L;
		
	//	farr[6] = 224.4;Incompaitable types possible lossy conversion double can't be converted into float
		
		
		Object[] obj = new Object[3];
		obj[0] = new Integer(10);
		obj[1] = new Object();//Warning
		obj[2] = new String("Sachin");

		for(int i=0;i<3;i++){
			System.out.println( obj[i]);
		}

	}
}

