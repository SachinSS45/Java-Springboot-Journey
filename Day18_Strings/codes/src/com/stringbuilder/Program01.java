package com.stringbuilder;
/*
StringBuilder :
    All method are same as StringBuffer but not synchronized
    It is faster . Not thread safe.
    Comes in JDK : 1.5v

    Methods Imp :
        1)int capacity();
        2)char charAt(int index);
        3)StringBuilder delete(int start,int end);
        4)StringBuilder deleteCharAt(int index);
        5)void ensureCapacity(int minCapacity);
        6)int indexOf();
        7)StringBuilder insert(index,String/char/boolean/float/int/double);
        8)int lastIndexOf();
        9)int length();
        10)StringBuilder replace(int start,int end,String str)
        11)StringBuilder replace(old char,new char);
        12)StringBuilder reverse();
        12)void setCharAt(int index,char ch);
        13)void setLength(int newLength);
        14)String subString(int start,int end);
        15)String toString();
        16)void trimToSize();
        17)int compareTo(Another String);
        18)boolean isEmpty();
 */
public class Program01 {
    public static void main(String[] args) {
        //create a StringBuilder object
        //using StringBuilder() constructor
        StringBuilder sb = new StringBuilder();
        sb.append("Sachin");
        System.out.println(sb);//Sachin

        //create a StringBuilder object
        //using StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("AAAABBBBCCCC");
        System.out.println(str1);//AAAABBBBCCCC

        //create a StringBuilder Object
        //using a StringBuilder(capacity) constructor
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("javaspring");
        System.out.println(sb2.capacity());//10
        sb2.append('b');
        System.out.println(sb2.capacity());//22 (10+1)*2

        //create a StringBuilder Object
        //using StringBuilder(String) constructor
        StringBuilder sb3 = new StringBuilder(str1);
        System.out.println(sb3);//AAAABBBBCCCC
    }
}
