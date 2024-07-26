/* 
Assignment Operator
+++++++++++++++++++
There are 3 types of assignment operator
    a.Simple assignment
        eg: int a= 10;
            int b= 20;
    b.Chained assignment
    c.Compound assignment :  += ,-=, /=, *=, %= &=,|=,^=
*/
public class AssignmentOperator {

    public static void main(String[] args) {
        // 2)Chained assignment
        // eg#1
        int a, b, c, d;
        a = b = c = d = 10; // valid

        // eg#2.
        // int a2 = b2 = c2 = d2 = 10; // invalid
        // System.out.println(a2 + " " + b2 + " " + c2 + " " + d2);

        // eg#3.
        int b3, c3, d3;
        int a3 = b3 = c3 = d3 = 10;// valid
        System.out.println(a3 + " " + b3 + " " + c3 + " " + d3);

        // eg#4.
        int a4, b4, c4, d4 = 10; // only d value is initialized
        System.out.println(d);// 10

        // Compound assignment ; += ,-=, /=, *=, %= &=,|=,^=

        /*
         * Note: In case of compound assignment operator, internally type casting will
         * be
         * performed automatically by the JVM similar to increment or decrement
         * operator.
         */

        // eg#1.
        int a5 = 10;
        a5 += 20;
        System.out.println(a5);
        // eg#2.
        byte b5 = 10;
        //b5 = b5 + 1;// incompatible types: required : int,found : byte
        System.out.println(b5);
        // eg#3.
        byte b6 = 10;
        b6++; // b= (byte)(b+1);
        System.out.println(b6);// 11
        // eg#4
        byte b7 = 10;
        b7 += 1;// b = (byte)(b+1);
        System.out.println(b7);// 11
        // eg#5.
        int a8, b8, c8, d8;
        a8 = b8 = c8 = d8 = 20;
        a8 += b8 -= c8 *= d8 /= 2;
        /*
         * d8= d8/2; 20/2 = 10
         * c8= c8*d8; 20*10 = 200
         * b8= b8-c8; 20-200 =-180
         * a8= a8+b8; 20-180 =-160
         */
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}