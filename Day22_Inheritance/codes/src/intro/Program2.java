package intro;

class Parent1{

    Parent1(){
        System.out.println("In parent Constructor");
    }
}

class Child1 extends Parent1{

    Child1(){
        super();
        System.out.println("In child constructor");
    }
}
public class Program2 {
    public static void main(String[] args) {

        Parent1 p = new Parent1();
        Child1 c = new Child1();
    }
}
/*
  Output : Parent Constructor
           Parent Constructor
           Child Constructor
 */