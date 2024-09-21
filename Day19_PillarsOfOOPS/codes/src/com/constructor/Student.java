package com.constructor;

public class Student {
    String name;
    int age;
    float height;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    //It is not good practice to write a zero argument constructor to initialize instance variables.
    //Because for every object it will initialize with same values
    Student(){
        name = "Dhoni";
        age = 41;
        height = 5.6f;
    }
    void Student(String name,int age,float height){
        System.out.println("Calling the method");
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
