package com.thisreference;

public class Student {
    //name ,age , height : instance variables
    private String name;
    private int age;
    private double height;
    //x , y , z local variables ( naming is not a good programming practice)
//    public void setData(String x,int y,double z){
//
//    }

    //we should give same name as instance variables names to local variables names
    //Here we are assigning local var to local var : Solution is "this" reference
    public void setData(String name,int age,float height){
        name = name;
        age = age;
        height = height;
    }

    public void displayData(){
        System.out.println("Name   is " + name);
        System.out.println("Age    is " + age);
        System.out.println("Height is " + height);
    }
}
