package com.snippet;

public class Program04 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("java");

       /* s1 = s2;
        if(s1==s2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }*/
        //Output : Equal

        if(s1.equalsIgnoreCase(s2)) System.out.println("Equal");
        else System.out.println("not equal");
        //Output : Equal

        String s3 = s2;
        if(s3.equalsIgnoreCase(s3)) System.out.println("Equal");
        else System.out.println("not equal");
        //Output : Equal

        if(s1.toLowerCase() == s2.toLowerCase()) System.out.println("Equal");
        else System.out.println("not equal");
        //Output : not equal (comparing ref not values)
    }
}
