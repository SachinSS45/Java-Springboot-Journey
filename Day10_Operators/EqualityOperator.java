/*
 EqualityOperator
++++++++++++++++
 ==,!=
=> We can apply equality operators on primitive types including boolean types
 */
public class EqualityOperator {

    public static void main(String[] args) {
        // eg#1.
        System.out.println(10 == 20);// false
        System.out.println('a' == 'b');// false
        System.out.println('a' == 97.0);// true
        System.out.println(false == false);// true
        // => we can apply equality operators on reference type also.
        // eg#2.
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
        System.out.println(t1 == t2);// false
        System.out.println(t1 == t3);// true

        // Note::
        // => To use == operator on reference type, we need to check whether there
        // exists a
        // relationship b/w 2 operands.
        // => If relationship exists, it should be parent-child relationship, otherwise
        // it
        // would result in "CompileTimeError".

        // eg#3.
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("sachin");
        StringBuffer sb = new StringBuffer("dhoni");
        System.out.println(t == o);// false
        System.out.println(o == s);// false
        // System.out.println(s == t);// CE
        // System.out.println(s == sb);// CE
    }
}