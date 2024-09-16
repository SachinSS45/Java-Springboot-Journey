package com.sachin;
/*
   Ways to create String :
 */
public class Program8 {
    public static void main(String[] args) {

        //1
        String str1 = "Sachin";

        //2
        String str2 = new String("Sachin");

        //3
        char[] ch = {'s','a','c','h','i','n'};
        String str3 = new String(ch);

        //4
        String str4 = new String();

        //5
        byte[] b = {97,98,99,100};
        String str5 = new String(b);

        //6
        StringBuffer sb = new StringBuffer("Sachin");
        String str6 = new String(sb);
        System.out.println(str6);

    }
}
