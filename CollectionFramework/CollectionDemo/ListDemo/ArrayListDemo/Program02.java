package ArrayListDemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Program02 {
    public static void main(String[] args) {
        
        //List : index plays a role[internally array]
        ArrayList al = new ArrayList();
        LinkedList ll = new LinkedList();

        System.out.println("ArrayList implements Serializable :: " + (al instanceof Serializable));//true
        System.out.println("LinkedList implements Serializable :: " + (ll instanceof Serializable));//true

        System.out.println("ArrayList implements Cloneable :: " + (al instanceof Cloneable));//true
        System.out.println("LinkedList implements Cloneable :: " + (ll instanceof Cloneable));//true

        System.out.println("ArrayList implements RandomAccess :: " + (al instanceof RandomAccess));//true
        System.out.println("LinkedList implements RandomAccess :: " + (ll instanceof RandomAccess));//false
    }
}
