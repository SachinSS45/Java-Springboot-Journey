/*
    Super() should always first line of constructor
 */
class Demo{
    Demo(){
        System.out.println("Inside Constructor");
        //super(); //Error : Call to super must be first statement in constructor
    }
}
public class Program2 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
    }
}
