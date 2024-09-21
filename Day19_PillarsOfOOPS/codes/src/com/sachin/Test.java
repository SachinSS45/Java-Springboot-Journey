package com.sachin;
//All about Encapsulation
public class Test {
    public static void main(String[] args) {
        TextBook tb = new TextBook();
        //tb.pages = 100;//we can't access directly
        tb.setPages(100);
        int pageCount = tb.getPages();
        System.out.println("No of pages are : " + pageCount);

        Student std = new Student();
        std.setSname("Sachin");
        System.out.println("Name : "+std.getSname());
    }
}
