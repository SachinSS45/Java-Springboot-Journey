package com.stringbuffer;

//insert(int index,String/int/long/double/boolean/float/Object o)
//insert() is a overloaded method
public class Program04 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("abcdefgh");
        sb.insert(2,"xyz");
        sb.insert(11,"9");
        System.out.println(sb);
    }
}
