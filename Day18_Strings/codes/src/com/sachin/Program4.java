package com.sachin;

public class Program4 {
    public static void main(String[] args) {
        String s = new String("sachin");
        /*
        In this case 2 objects will be created one in the heap and the other one in
        the String Constant Pool,
        the reference will always point to Heap.
        */

        String s1 = "sachin";
        /*
        In this case only one object will be created in the SCP, and it will be referred by our reference.
         */

    }
}
