package com.sachin;
/*
    Methods of String Class :
    1)public char charAt(int index);
    2)public String concat(String str);
    3)public boolean equals(Object o);
    4)public boolean equalsIgnoreCase(String str);
    5)public String subString(int begin);
    6)public String subString(int begin,int end);
    7)public int length(String str);
    8)public String replace(char old,char new);
    9)public String toLowerCase(String str);
    10)public String toUpperCase(String str);
    11)public String trim();
    12)public int indexOf(char ch);
    13)public int lastIndexOf(char ch);
    14)public char[] toCharArray(String
 */

public class Program9 {
    public static void main(String[] args) {
        String name = "Sachin";
        //System.out.println(name[3]);

        //1.charAt(int index);
        System.out.println(name.charAt(0));//S
        //System.out.println(name.charAt(-1));//StringIndexOutOfBoundException : String index out of range: -1
        //System.out.println(name.charAt(6));//String index out of range: 6

        //2.subString();
        //System.out.println(name.substring(3,7));//OutOfBound
        System.out.println(name.substring(2,5));//chi (it will not take index 5 character)
        System.out.println(name.substring(1));//achin

        //3.equals() and equalsIgnoreCase();
        System.out.println(name.equals("Sachin"));//true
        System.out.println(name.equals("sacHin"));//false
        System.out.println(name.equalsIgnoreCase("sacHIN"));//true

        //4.concat()
        System.out.println(name.concat(" Shetkar"));
        System.out.println(name);

        //5.length()
        System.out.println(name.length());//6

//        for(int i=0;i<10;i++){
//            System.out.println(i+1);
//        }

//        int a = 10;
//        float f = 10.5f;
//        char ch = 'a';
//        // You have to use format specifier in printf like : %d , %f ... except for String
//        System.out.printf("%d",a);
//        //System.out.printf(a);//Error
//
//        //No need to specify, format specifier only for String type.
//        String carName = "Ferrari";
//        System.out.printf(carName);
//
//        //But you can't use format specifier in println or print it will give compile time error
//        //System.out.println("%d",a);//Error : no suitable method found for println
//
//        //It is very hard to remember all format specifier for beginner, so we prefer println/print over prinf method
//        //In println no need to tell about specifier we can directly print anything
//        System.out.println(a);//10


        //6 : toUpperCase
        String name2 = "Subramanyam";
        System.out.println("Actual Data : " + name2);
        System.out.println("UPPER CASE : " + name2.toUpperCase());
        System.out.println("lower case : " + name2.toLowerCase());
        System.out.println(name2);

        //7 : replace()
        String str = "ababab";
        System.out.println(str.replace('a','b'));//bbbbbb
        System.out.println(str);//ababab


    }
}
