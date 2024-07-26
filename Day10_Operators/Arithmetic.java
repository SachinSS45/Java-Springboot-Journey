/*
Arithmetic operator
+++++++++++++++++++
operators : +,-,*,/,%

    Note: if we apply arithmetic operators b/w 2 variables then the result type is always max(int,typeof a, typeof b)
        eg: byte + byte = int
        byte + short = int
        int + double = double
        char + char = int
        char + double = double
    / and % -> possiblity of getting ArithmeticException when operated on integral arithmetic type,but not on floating type.
        / => extracts the quotient and performs the operation.
        % => extracts the remainder and performs the operation.
 */
public class Arithmetic {

    public static void main(String[] args) {
        // eg#1.
        System.out.println('a' + 'b');// 195
        System.out.println('a' + 1);// 98
        System.out.println('a' + 1.2);// 98.2

        // eg#2. In intergral arithmetic(byte,short,int,long) there is no way to
        // represent "Infinity", so result will be "ArithmeticException".
        // In case of double,float types, there is a possiblity of storing "Infinity" so
        // the result will be "Infinity".
        System.out.println(10 / 0.0); // int/double = +double
        System.out.println(-10 / 0.0); // -int/double = -double
        System.out.println(0 / 0); // int/int = int
        /*
         * output :
         * Infinity
         * -Infinity
         * ArithmeticException :/by zero
         */

        /*
         * Nan(Not a Number) is a integral arithmetic(byte,short,int,long) there is no
         * way to represent the undefined result, so it would throw
         * an Exception called "ArithmeticException".
         * But floating point arithmetic(double,float) there is a way to represent the
         * undefined result, so the result would be "Nan".
         */
        // eg#1.
        System.out.println(0.0 / 0.0); // double/double -> double
        System.out.println(-0.0 / 0.0);// double/double -> double
        System.out.println(0 / 0); // int/int -> int
        /*
         * Output
         * Nan
         * Nan
         * ArithmeticException : /by zero
         */
        // Note: for any value of 'x' including NaN, the result will be false.

        // <, <=, >, >= , ==, !=
        System.out.println(10 < Float.NaN);// false
        System.out.println(10 <= Float.NaN);// false
        System.out.println(10 > Float.NaN);// false
        System.out.println(10 >= Float.NaN);// false
        System.out.println(10 == Float.NaN);// false
        System.out.println(Float.NaN == Float.NaN);// false
        System.out.println(10 != Float.NaN);// true
        System.out.println(Float.NaN != Float.NaN);// true

        // '+' operator applied on Strings in Java
        /*
         * '+' operator in java is refered as "Overloaded-Operator".
         * '+' operator will perform addition if both the operands are of numeric type(byte,short,int,long,float,double)
         * '+' operator will perform concatination, if one of the operand is of "String" type.
         */
        //eg#1.
        String name="sachin";
        int a= 10,b=20,c=30;
        //int + String => concatination(joining String)
        System.out.println(a+b+c+name);//60sachin
        System.out.println(name+a+b+c);//sachin102030
        System.out.println(a+b+name+c);//30sachin30
        System.out.println(a+name+b+c);//10sachin2030
        
        //eg#2.
        String name1="sachin";
        int a1= 10,b1=20,c1=30;
        //name1 = a1+b1+c1;//CE:incompatible type
        System.out.println(name1);
        
        //eg#3.
        String name2="sachin";
        int a2= 10,b2=20,c2=30;
        name2=name2+a2+b2;
        c=a2+b2;
        //c=a2+b2+name2; //CE: incompatible
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        

    }
}