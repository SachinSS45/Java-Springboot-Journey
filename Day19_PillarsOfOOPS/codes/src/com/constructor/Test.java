package com.constructor;


//We can overload main method
public class Test {
    //Driving code (method)
    public static void main(String[] args) {
        System.out.println("Inside String[] args");//Inside String[] args
        main(10);//Inside int arg
        main();//Inside no argument

    }
    //user defined method
    public static void main(int args) {
        System.out.println("Inside int arg");
    }
    //user defined method
    public static void main(){
        System.out.println("Inside no argument");
    }
}
