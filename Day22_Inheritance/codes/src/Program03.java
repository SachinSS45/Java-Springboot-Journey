class Demo1 {
    Demo1(){
        this(10);
        System.out.println("Inside Constructor");
        //this(10);//Error : call to this must be first statement in constructor
    }
    Demo1(int i){
        System.out.println("Inside One-Arg Constructor");
    }
}
public class Program03 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
    }
}
