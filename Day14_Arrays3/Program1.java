/* We will learn about length() and length : */
public class Program1{

	public static void main(String[] args){

		//length property vs length() method.

		//length is property belongs to arrays and length() is the method of String class

		//Signature of length() method : public int length();

		String name = "Sachin";
		System.out.println(name);
		System.out.println(name.length());//6
		//System.out.println(name.length);//CE : can't find symbol
		
		//Signature of length property : public final int length;
		//It will return number of elements present in the array 

		int[] arr = { 1, 2, 3};
		//System.out.println(arr.length());//CE : Can't find symbol
		System.out.println(arr.length);//3

	}
}
