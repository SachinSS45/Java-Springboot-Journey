package com.stringbuffer;
//delete(int start,int end) -> It will delete from start to end-1
//deleteCharAt(int index)
public class Program05 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("sachintendulkar");
        System.out.println(sb);//sachintendulkar

        sb.delete(0,6);
        System.out.println(sb);//tendulkar
        sb.deleteCharAt(2);
        System.out.println(sb);//tedulkar
    }
}
