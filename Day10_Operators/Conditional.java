/*
 Conditional Operator
 +++++++++++++++++++
    It is also called as "Ternary operator".
    Syntax:
        condition ? true : false
 */

public class Conditional {

    public static void main(String[] args) {
        // eg#1.
        int x = 10 == 10 ? 100 : 500;
        System.out.println(x);// 100

        // eg#2.
        int x2 = (10 > 20) ? 30 : (40 > 50) ? 60 : 70;
        System.out.println(x2);// 70

        // eg#3.
        int x3 = (10 > 20) ? 30 : (100 > 20) ? 40 : 50;
        System.out.println(x3);// 40

        // eg#4.
        byte c = (10 > 20) ? 30 : 40; // byte c = 40;
        byte d = (10 < 20) ? 30 : 40; // byte d = 30;
        System.out.println(c + " " + d); // 40 30

        final int a = 10, b = 20;
        byte c1 = (a > b) ? 30 : 40;// byte c = 40;
        byte d1 = (a < b) ? 30 : 40;// byte d = 30;
        System.out.println(c1 + " " + d1); // 40 30

        int a1 = 10, b1 = 20;
        // byte c2= (a1 > b1) ? 30: 40;//CE
        // byte d2= (a1 < b1) ? 30: 40;//CE
        // System.out.println(c2 + " " + d2);

    }
}