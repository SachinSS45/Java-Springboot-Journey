package com.sachin;
public class Program10 {
    public static void main(String[] args) {
        //1 : trim() : To remove blank spaces present at beggining and end of String but not present at the blank spaces
        //present at the middle of String
        String name = "   sachin   ";
        System.out.println(name.trim());

        String s2 = "sa ch in ";
        System.out.println(s2.trim());

        //2. public int indexOf(char ch) : it return the index of 1st occurrence if char is present else returns -1
        String s = "sachinshetkar";
        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('z'));//-1

        //3.public int lastIndexOf(char ch) : it return the index of last occurrence if char is present else returns -1
        System.out.println(s.lastIndexOf('a'));//11
        System.out.println(s.lastIndexOf('c'));//2
        System.out.println(s.indexOf('c'));//2

        //4. isEmpty(): returns true if length is 0 otherwise false
        //5. isBlank() returns true if the string is empty or contains only white space codepoints, otherwise false
        String str = "";
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());

        str = "   ";
        System.out.println(str.isBlank());//true
        System.out.println(str.isEmpty());//false

        //6 : repeat(int) : it will repeat String multiple times
        String str1 = "Sachin";
        System.out.println(str1.repeat(2));//SachinSachin

        //7 : strip() : similar to trim()

        String str2 = "  Sachin\tShetkar\tAmdocs";
        System.out.println(str2.trim());//Sachin  Shetkar  Amdocs
    }
}
