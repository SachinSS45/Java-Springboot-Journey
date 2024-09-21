package com.thisreference;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData("Sachin",22,5.8f);
        s.displayData();
        /*
        Ouptut :
        Name is null
        Age is 0
        Height is 0.0
         */

        //For Library class

        Library lib = new Library();
        System.out.println(lib);
        lib.setData(123,"Book1");
        lib.displayData();
    }
}
