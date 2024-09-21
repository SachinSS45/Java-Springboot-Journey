package com.staticconcept;


public class Program01 {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin",49);
        System.out.println("Name is : " + s1.name);
        System.out.println("Age  is : " + s1.age);
        System.out.println("Nationality is : "+Student.nationality);
    }
}
