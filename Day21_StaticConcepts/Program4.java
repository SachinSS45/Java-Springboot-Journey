//instance block

public class Program4{
	
	int i = 10;
	{
		methodOne();
		System.out.println("First Instance block");
	}

	Program4(){
		System.out.println("Program4 class constructor");
	}

	public static void main(String[] args){

		Program4 obj = new Program4();
		obj.methodOne();
	}
	public void methodOne(){
		System.out.println(j);
	}
	{
		System.out.println("Second Instance Block");
	}
	int j = 20;
}

//Output : 0
//	   First Instance Block
//	   Second Instance Block
//	   Program4 class constructor
//	   20
