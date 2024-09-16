package com.snippet;

public class Program06 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Sachin");
        sb.insert(8,"tendulkar");
        sb.reverse();
        sb.append("INDIA");
        sb.reverse();
        System.out.println(sb);//AIDNISachintendulkar
    }
}
