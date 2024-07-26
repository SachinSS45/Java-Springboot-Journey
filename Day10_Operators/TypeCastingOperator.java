/*
 Type casting operator
++++++++++++++++++++
    1. implicit/narrowing => compiler will automatically do(no loss of data)
    2. explicit/widening => programmer should do(loss of data might happen)
    => if we work with floating point data and if we try to assign it to integral type
    using explicit typecasting then the data after decimal value will be lost.
 */
public class TypeCastingOperator {

    public static void main(String[] args) {

        // eg#1.
        float x = 150.1234f;
        int i = (int) x;
        System.out.println(i);// 150
        double d = 130.456;
        int j = (int) d;
        System.out.println(j);// 130

        /*
         * => While working with integral types, storing higher value in lower type
         * using
         * explicit typecasting might lead to data loss.
         */

        //
        int x2 = 150;
        short s = (short) x2;
        System.out.println(s);// 150
        // minRange + (result-maxRange-1)
        /*
         * =-128 + (150-127-1)
         * =-128 + 150-128
         * = -128+22
         * = -106
         */
        byte b = (byte) x;
        System.out.println(b);// -106
        // eg#2.
        double d2 = 130.456;
        int x3 = (int) d2;
        System.out.println(x3);// 130
        // minRange + (result-maxRange-1)
        /*
         * =-128 + (130-127-1)
         * =-128 + 130-128
         * = -128+2
         * = -126
         */
        byte b2 = (byte) d2;
        System.out.println(b2);// -126
    }
}