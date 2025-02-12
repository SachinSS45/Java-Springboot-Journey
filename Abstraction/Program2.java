//We can write and extend abstract class without writing any abstarct method in abstract class
abstract class Demo{
	
	abstract int a;
	/*public void demo(){
		System.out.println("In abstract class");
	}*/
}

class Program2 extends Demo{

	public static void main(String[] args){
		//Demo ref = new Program2();
		//ref.demo();
	}
}
