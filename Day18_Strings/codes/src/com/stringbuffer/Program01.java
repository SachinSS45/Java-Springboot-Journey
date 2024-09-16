package com.stringbuffer;
/*
    Mutable : If we try to make a change with that change no new object will be created,change will happen on the same
              object
    To create a mutable String in java we have two classes :
       1)StringBuffer
       2)StringBuilder
 */
public class Program01 {
    public static void main(String[] args) {

        //StringBuffer sb = new StringBuffer();
        //System.out.println(sb);//No output
        //System.out.println(sb.capacity());//16 : (Default capacity is 16)
        //public synchronized int length()
        //public synchronized int capacity()

        StringBuffer sb = new StringBuffer("sachin");
        System.out.println(sb);//sachin
        System.out.println(sb.length());//6

        //newcapacity = (currentcapacity + 1)*2 // if at starting String is Empty then use this formula
        //newcapacity = currentcapacity + length of the string // if at starting String is present use this formula
        System.out.println(sb.capacity());//22

        StringBuffer sb2 = new StringBuffer();
        System.out.println(sb2);//No output
        System.out.println(sb2.capacity());//16
        sb2.append("abcdefghijklmnop");//16
        System.out.println(sb.capacity());
        sb2.append("q");
        System.out.println(sb2.capacity());//34

    }
}
