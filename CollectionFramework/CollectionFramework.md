# Collection Framework : 
## Set Interface : 
                                java.util.Collection (Interface) - Java 1.2
                                               ↑
                                 java.util.Set (Interface) - Java 1.2
                                              ↑
                                --------------------------------------
                               ↑                                     ↑
            java.util.HashSet - Java 1.2                     java.util.SortedSet (Interface) - Java 1.2
                               ↑                                               ↑
            java.util.LinkedHashSet - Java 1.4                java.util.NavigableSet (Interface) - Java 1.6
                                                                                 ↑
                                                              java.util.TreeSet - Java 1.2
                  
                             
                       
### 🧠 Key Notes:
- Set extends Collection
- HashSet implements Set
- LinkedHashSet extends HashSet (✅ maintains insertion order)
- TreeSet implements NavigableSet → SortedSet → Set
- NavigableSet introduced in Java 1.6

### Set:
- It is the Child Interface of Collection.
- If we want to Represent a Group of Individual Objects as a Single Entity where Duplicates are Not allowed and Insertion Order is Not Preserved then we should go for Set.
- Set Interface doesn't contain any new Methods and Hence we have to Use Only Collection Interface Methods.
### HashSet
1. Duplicates are not allowed,if we try to add it would not throw any error rather it would return false.
2. Internal DataStructure: **Hashtable**
3. null insertion is possible.
4. heterogenous data elements can be added.
5. If our frequent operation is search, then the best choice is HashSet.
6. It implements Serializable,Cloneable, but not random access.

### Constructors
1. HashSet s=new HashSet(); Default initial capacity is 16
Default FillRation/load factor is 0.75
**Note**: In case of ArrayList, default capacity is 10, after filling the complete capacity then new ArrayList would be created.
In case of HashSet, **after filling 75% of the ratio only new HashSet will be created**.
2. HashSet s=new HashSet(int intialiCapacity);//specified capacity with default fill ration=0.75
3. HashSet s=new HashSet(int initaliCapacity,float fillRatio)
4. HashSet s=new HashSet(Collection c);
#### LoadFactor
- After loading how much ratio,a new object will be created is called as "LoadFactor".
import java.util.*;
' ' ' 
public class Test {
    public static void main(String[] args) {
        // Underlying DataStructure: Hashtable
        // Introduced in JDK 1.2
        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("A");     // Duplicate, won't be added
        hs.add(null);    // Allows one null

        System.out.println(hs); // Output: [null, A, B, C, D] - Order not guaranteed
        System.out.println();

        // Underlying DataStructure: Hashtable + LinkedList
        // Introduced in JDK 1.4
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("A");
        lhs.add("B");
        lhs.add("Z");
        lhs.add("C");
        lhs.add(10);     // Allows heterogeneous elements

        System.out.println(lhs); // Output: [A, B, Z, C, 10] - Insertion order maintained
    }
}
' ' '
