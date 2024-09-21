package com.staticconcept;

public class Program02 {
    String name;
    int age;
    static String nationality = "IND";

    public Program02(String name, int age) {
        System.out.println("Constructor got called");
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("Static block : Loading of .class file");
    }
    public void dispStdDetails(){
        System.out.println("Inside instance method");
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Nationality is : "+nationality);
    }

    public static void main(String[] args) {
        Program02 obj = new Program02("Sachin",49);
        obj.dispStdDetails();
        /*
        Static block : Loading of .class file
        Constructor got called
        Inside instance method
        Name is : Sachin
        Age is : 49
        Nationality is : IND
         */
    }
}
