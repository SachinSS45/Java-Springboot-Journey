package com.snippet;

public class Program01 {
    public static void main(String[] args) {

        String str = "  ";
        str.trim();
        System.out.println(str.equals("") + " " + str.isEmpty()); // false false  //Becz we haven't stored obj of str.trim()
    }
}
