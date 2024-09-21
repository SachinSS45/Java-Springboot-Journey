package com.constructor;

public class Main {
    public static void main(String[] args) {
        //Constructing the object
        Student std = new Student("Sachin",22,5.8f);

        //getting the values from instance variables
        System.out.println(std.name + " " + std.age + " " + std.height);//Sachin 22 5.8

        Student std2 = new Student();
        System.out.println(std2.name + " " + std2.age + " " + std2.height);//Dhoni 41 5.6
        Student std3 = new Student();
        System.out.println(std3.name + " " + std3.age + " " + std3.height);//Dhoni 41 5.6
        std3.Student("Subrya",23,5.7f);

    }
}
