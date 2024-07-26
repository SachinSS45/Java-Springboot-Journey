/* 
Bitwise Operator
++++++++++++++++
1. & => If both the arguments are true, then only result in true.
2. | => If atleast one argument is true, then result is true.
3. ^ => If both arguments are of different type, then result in true.
4. ~ => It is negation operator.
    &,|,^ => These operators can be applied on boolean and even on integral types.
        ~(bitwsise complement) => This operator can be applied on integral types, but
        not on boolean types.
        !(boolean complement) => This operator can be applied only on boolean types,
        but not on integral types.

Note:
=> Negative no will be stored inside the computer using 2's complements.
=> For a negative number MSB will be 1, where as for a positive number MSB will be 0.

*/
public class Bitwise {

    public static void main(String[] args) {
        // eg#1.
        System.out.println(4 & 5);// 4
        System.out.println(4 | 5);// 5
        System.out.println(4 ^ 5);// 1
        System.out.println(~4);
       // System.out.println(~true);// CE
        System.out.println(!true);
        //System.out.println(!4);// CE

    }
}