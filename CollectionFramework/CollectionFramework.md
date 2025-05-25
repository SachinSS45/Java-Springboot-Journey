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
=> It is the Child Interface of Collection.
=> If we want to Represent a Group of Individual Objects as a Single Entity where
Duplicates are Not allowed and Insertion Order is Not Preserved then we should go for Set.
=> Set Interface doesn't contain any new Methods and Hence we have to Use Only Collection Interface Methods.
