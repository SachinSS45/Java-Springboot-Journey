package com.sachin;
/*
 Direct literals are always placed in SCP,Because of runtime operation if
 object is required to create compulsorily that object should be placed on the Heap,but not on SCP.
*/
public class Program6 {
    public static void main(String[] args) {
        String s = new String("sachin");//s1->sachin(heap)
        s.concat("tendulkar");//no reference stored address it will collected by GC but tendulkar will be creted inside SCP
        s=s.concat("IND");//s1->sachinIND(Heap)  and IND will created in SCP and sachin in heap will eligible for GC
        s="sachintendulkar";//s1->sachintendulkar(SCP) and sachinIND will eligible for GC

    }
}
