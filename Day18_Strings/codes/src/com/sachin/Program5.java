package com.sachin;
/*
 Note::
 =>Object creation in SCP is always optional,1st jvm will check is any object
already created with required content or not.
 =>If it is already available then it will reuse the existing object instead of
creating the new Object.
 =>If it is not available only then new object will be created, so we say in
SCP there is no chance of existing 2 objects with the same content. In SCP duplicates are not permitted.
 =>Garbage Collector cannot access SCP Area, Even though Object does not have
any reference still object is not eligible for GC.
 =>All SCP objects will be destroyed only at the time of JVM ShutDown.
 */
public class Program5 {
    public static void main(String[] args) {
        String s1 = new String("sachin");//s1->100(Heap)
        String s2 = new String("sachin");//s2->300(Heap)
        String s3 = "sachin";//s3->200(SCP)
        String s4 = "sachin";//s4->200(SCP)

    }
}
