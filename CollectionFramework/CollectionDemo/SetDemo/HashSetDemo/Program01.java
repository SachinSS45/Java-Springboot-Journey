package HashSetDemo;
/*
 * HashSet : Class which implements Set interface (which doesn't have any new method)
 * - contains only unique elements
 * - Internally uses HashTable datastructure
 * - Doesn't maintain insertion order
 * - Best suit for seraching 
 */
import java.util.HashSet;

public class Program01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");
        set.add(null);
        set.add(null);
        System.out.println(set);//[B, A, C, D, null]
    }
}