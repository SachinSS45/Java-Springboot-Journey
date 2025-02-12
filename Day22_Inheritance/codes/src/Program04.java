class Demo3{
    Demo3(){
        super();
       // this(10);
        //super();
    }
    Demo3(int i){
        System.out.println("Inside One-Arg Constr");
    }
}
public class Program04 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
    }
}
//Output : Inside one-arg constr
