/*
 * equals() method : String class override method from Object class
 * It Strings it compares the Content while in Object class it compares reference.
 * == -> compares the reference
 * StringBuffer doesn't override the equals() method from Object class only overrides the toString() method it print the data present in reference
 */

class Program3{

	public static void main(String[] args){

		String s1 = new String("Sachin");
		String s2 = new String("Sachin");

		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1);//Sachin
		System.out.println(s2);//Sachin
		
		StringBuffer sb1 = new StringBuffer("Sachin");
		StringBuffer sb2 = new StringBuffer("Sachin");

		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		System.out.println(sb1);//Sachin
		System.out.println(sb2);//Sachin
	}
}
