# Collection Framework : 
<details>
<summary><strong>📂 Set Interface</strong></summary>
  
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
<details> <summary><strong>🔗HashSet & LinkedHashSet</strong></summary>
  
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
```java
//eg#1.
import java.util.*;
public class Test{
    public static void main(String[] args){
        //Underlying datastructure is Hashtable
        //JDK1.2 Version
        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("A"); //Duplicate, won't be allowed
        hs.add(null); //Allows one null
        System.out.println(hs);//Output : [null, A, B, C, D] - order not guaranteed
        System.out.println();
        //Underlying DataStructure :: Hashtable + LinkedList
        //JDK1.4 Version
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("A");
        lhs.add("B");
        lhs.add("Z");
        lhs.add("C");
        lhs.add(10); //Allows heterogeneous elements
        System.out.println(lhs);//Output : [A, B, Z, C, 10] - Insertion order maintained
  }
}
```
### LinkedHashSet         

- It is the **child class** of `HashSet`.     <-- bullet point with bold and inline code
- **Data Structure:** Hashtable + LinkedList
- **Duplicates:** Not allowed
- **Insertion Order:** Preserved
- **Null Allowed:** Yes

All constructors and methods of `HashSet` are part of `LinkedHashSet`, **except** that `LinkedHashSet` **preserves insertion order**.

---

#### Difference between HashSet and LinkedHashSet    
| Feature           | HashSet                 | LinkedHashSet              |    
|-------------------|-------------------------|----------------------------|
| Underlying DS     | Hashtable               | Hashtable + LinkedList     |
| Duplicates        | Not allowed             | Not allowed                |
| Insertion Order   | Not preserved           | Preserved                 |
| Introduced in     | Java 1.2                | Java 1.4                  |

---

#### Note:               
- Insertion order is preserved, but duplicates are **not allowed**.
- Use `LinkedHashSet` when you want a **cache-based application** where:
  - Duplicates are not allowed        
  - Insertion order must be preserved
#### RealTime Example : 
- Cache Implementation : In simple caching systems where you want to keep track of unique items in the order they were accessed or inserted, so you can evict the oldest item when cache size exceeds a limit.
- Tracking History or Recently Visited Pages : For browser history or recent files list where duplicates are not allowed, but the insertion order needs to be maintained for displaying.
</details>

<details> <summary><strong>🔗SortedSet</strong></summary>
### SortedSet (Interface)    

- It is the **child interface** of `Set`. 
- Represents a group of individual objects where **duplicates are not allowed**, and elements are **sorted** in some order.

**Examples of SortedSets:**
{3, 2, 1}
{1, 2, 3}
{3, 1, 2}
{2, 1, 3}


All of these represent the same sorted set: `{1, 2, 3}`.

---

### Specific Methods of SortedSet    

| Method                                | Description                                                                          |
|-------------------------------------|--------------------------------------------------------------------------------------|
| `Object firstElement()`              | Returns the **first (lowest)** element in the set.                                  |
| `Object lastElement()`               | Returns the **last (highest)** element in the set.                                  |
| `SortedSet headSet(Object obj)`     | Returns a subset of elements **less than** `obj`.                                   |
| `SortedSet tailSet(Object obj)`     | Returns a subset of elements **greater than or equal to** `obj`.                     |
| `SortedSet subSet(Object obj1, Object obj2)` | Returns a subset of elements **>= obj1 and < obj2**.                             |
| `Comparator comparator()`            | Returns the `Comparator` used for sorting; returns `null` for natural ordering.      |

---

### Notes on Natural Ordering    

- For **String objects**, the default natural sorting order is **alphabetical (A to Z)**.
- For **Number objects**, the default natural sorting order is **ascending (0 to 9)**.

---

### Example with SortedSet

Given this sorted set:  
`100, 101, 102, 103, 104, 105, 106, 107`

| Method call                | Result                |
|----------------------------|----------------------|
| `firstElement()`            | `100`                |
| `lastElement()`             | `107`                |
| `headSet(104)`              | `100, 101, 102, 103` |
| `tailSet(105)`              | `105, 106, 107`      |
| `subSet(101, 104)`          | `101, 102, 103`      |
| `comparator()`              | `null`               |

---
</details>
</details>
