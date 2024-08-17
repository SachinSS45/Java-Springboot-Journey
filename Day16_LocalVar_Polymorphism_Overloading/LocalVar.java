/*
 * Local Varaibles : Var declared inside method are called as local varaibles
 * -Scope is limited to that method or to that block if we try to access them outside the block or method it would result in "CE".
 *  -Local var will be created during method execution inside stack and they will destroyed once the control comes out of method execution.
 *  - At local level var we can use only 'final' access modifier with local var
 *  */
public class LocalVar{

	public static void main(String[] args){
		
		//1
		
		/*int z;
		System.out.println(z);*/ 
		//CE(z might not have been intailized)
		
		int x = 10;
		int y = 20;

		add(x,y);

		//2

		try{
			int i = Integer.parseInt("10");
		}catch(Exception e){
			System.out.println(e);//No Error
		      //System.out.println(i);//Compile Time Error
		}
	}
	
	static void add(int a,int b){
		int c = a + b;
		System.out.println(c);//30
	}
}
