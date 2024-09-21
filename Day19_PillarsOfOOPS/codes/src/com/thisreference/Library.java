package com.thisreference;

public class Library {
    int sbin;
    String bookName;

    public void setData(int sbin,String bookName) {
        this.sbin =sbin;
        this.bookName = bookName;
    }

    public void displayData(){
        System.out.println("Library id : " + this.sbin);
        System.out.println("Book Name : " + this.bookName);
    }

}
