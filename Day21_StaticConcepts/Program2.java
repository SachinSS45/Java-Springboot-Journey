public class Program2{
	static int i = 10;

	static{
		methodOne();
		System.out.println("First static block");
	}

	public static void main(String[] args){
		methodOne();
	}
	public static void methodOne(){
		System.out.println(j);
	}
	static{
		System.out.println("Second Static Block");
	}
	static int j = 20;
}
//Output : 0
//	   First Static block
//	   Second Static Block
//	   20
