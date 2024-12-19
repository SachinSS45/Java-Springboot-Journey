package intro;

/*
    Note :
        1)whatever we write in parent under public category,by default will be available to child class.
        2)Whatever child class has under public category by default won't be available to parent class.
        3)Using parent reference we can make a call only to the parent class methods but not the child class
          specialized methods.
        4)Parent class reference can be used to collect child class objects,but by using parent class reference,
          we can call only parent class methods but not the child class specialized methods.
        5)Child class reference can't be used to hold the parent class objects.
 */

class Parent{

    public void methodOne(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{

    public void methodTwo(){
        System.out.println("Child Method");
    }
}
public class Test {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.methodOne();//Parent Method
        //p.methodTwo();//can't find symbol

        System.out.println();

        Child c = new Child();
        c.methodOne();//Parent Method (Inherited method from parent to child)
        c.methodTwo();//Child Method

        System.out.println();

        Parent p1 = new Child();
        p1.methodOne();//Parent Method
        //p1.methodTwo();//CE : Can't find symbol
        System.out.println();

        //Child c1 = new Parent();//CE : Incompatible types parent can't be converted to child
    }
}
