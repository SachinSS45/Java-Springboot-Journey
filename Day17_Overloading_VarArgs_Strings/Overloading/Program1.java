
public class Program1{
	
	public void m1(int i,float f){
		System.out.println("int-float arg method");
	}
	public void m1(float f,int i){
		System.out.println("float-int arg method");
	}
	public static void main(String[] args){
	
		Program1 obj = new Program1();
		obj.m1(10,10.5f);//int-float
		obj.m1(10.5f,10);//float-int
	//	obj.m1(10,10); // CE: Reference to m1 is ambigious
		obj.m1(10.5f,10.5f);//CE : No sutaible method found 

	}
}


