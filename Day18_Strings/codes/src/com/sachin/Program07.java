package com.sachin;

public class Program7 {
    public static void main(String[] args) {
        String s1=new String("you cannot change me!");//s1->100(heap)
        String s2=new String("you cannot change me!");//s2->300(heap)
        System.out.println(s1==s2);//false

        String s3="you cannot change me!";//s3->200(SCP)
        System.out.println(s1==s3);//false

        String s4="you cannot change me!";//s4->200(SCP)
        System.out.println(s3==s4);//true

        String s5="you cannot " + "change me!";//s5->200(SCP) //const
        System.out.println(s3==s5);//true

        String s6="you cannot ";//s6->400(SCP)
        String s7=s6+"change me!";//s7->600(Heap)
        System.out.println(s3==s7);//false

        final String s8="you cannot ";//s8->scp(400)
        String s9=s8+"change me!";//s9->scp(200) becz s8 is final
        System.out.println(s3==s9);//true
        System.out.println(s6==s8);//true

    }
}
