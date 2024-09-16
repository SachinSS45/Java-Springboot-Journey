package com.stringbuffer;

//append(String/int/long/double/float/boolean) : It is overloaded method
//concat(String) : for others ex int long not true in String class
public class Program03 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("The value of PIE is :: ");
        sb.append(3.1414);
        sb.append(" This is exactly ");
        sb.append(true);
        System.out.println(sb);//The value of PIE is :: 3.1414 This is exactly true
    }
}
