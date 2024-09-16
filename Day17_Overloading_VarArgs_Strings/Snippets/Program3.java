public class Program3{

	public static void main(String[] args){
	
		int i = 5;

		if( i++ < 6 ){
			System.out.println(i++);
		}
		
		//Output : 6 ( Post increment)

		int a = 100;
		System.out.println(-a++);//-100
		System.out.println(a);//101
		
	}
}
