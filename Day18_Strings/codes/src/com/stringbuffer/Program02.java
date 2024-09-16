package com.stringbuffer;
/*
    StringBuffer Imp Methods :
        1)length()
        2)capacity()
        3)charAt(index)
        4)setCharAt(index,char)
 */
public class Program02 {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("sachin");
        System.out.println(sb.length());//6
        System.out.println(sb.capacity());//22
        System.out.println(sb.charAt(5));//n
       // System.out.println(sb.charAt(30));//StringIndexOutOfBoundException
        //sb.setCharAt(6,'s');//StringIndexOfBoundException
        sb.setCharAt(5,'a');
        System.out.println(sb.charAt(5));//a
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnopqrs");
        System.out.println(sb.length());
        System.out.println(sb);//sachia
        System.out.println(sb.capacity());
    }
}
