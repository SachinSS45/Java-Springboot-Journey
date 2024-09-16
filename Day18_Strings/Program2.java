/* Immutable : Value can't be changed
 * Mutable : can be changed
 * 
 * String : Immutable
 * StringBuffer , StringBuilder : Mutable
 */

public class Program2{

	public static void main(String[] args){
		
		//String(Immutable)

		String name = new String("Sachin");
		name.concat("Shetkar");
		System.out.println(name);//Sachin (Becz we haven't collected new object reference created at name.concat("Shetkar") 
	
		//StringBuffer(Mutable)

		StringBuffer sb = new StringBuffer("Sachin");
		sb.append("Shetkar");//Here no new object is created changes happend in original object
		System.out.println(sb);//SachinShetkar
	}
}
