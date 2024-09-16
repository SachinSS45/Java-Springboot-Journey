package com.stringbuffer;
//1.setLength(int) : If you don't want to change the length of String
//2.trimToSize() :
//3.ensureCapacity(int) : It is used to increse the capacity dynamically based on your requirement
public class Program07 {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("SachinTendulkar");
        sb1.setLength(6);
        System.out.println(sb1);//Sachin
        sb1.append("Shetkar");
        System.out.println(sb1);//SachinShetkar


        StringBuffer sb2 = new StringBuffer(100000);
        System.out.println(sb2.capacity());//100000
        sb2.append("Sachin");
        System.out.println(sb2.capacity());//100000
        sb2.trimToSize();
        System.out.println(sb2.capacity());//6
        sb2.append("Shetkar");
        System.out.println(sb2);
        System.out.println(sb2.capacity());//14

        //3
        StringBuffer sb3 = new StringBuffer();
        System.out.println(sb3.capacity());//16
        sb3.ensureCapacity(1000);
        System.out.println(sb3.capacity());//1000
    }
}
