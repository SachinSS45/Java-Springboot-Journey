import java.util.Stack;
/*
 * Stack : Java 1.0 (Legacy Class)
 * Used for LIFO Purpose 
 *
 */
public class Program01 {
    public static void main(String[] args) {
       Stack s = new Stack();
       System.out.println(s.empty()); //true
       //push(object o)::to add element in stack from back 
       s.push("A");
       s.push("B");
       s.push("C");
       System.out.println(s);//[A,B,C]

       System.out.println("Pop element is :: " + s.pop());//C
       //empty() :: boolean => Used to check whether stack is empty or not 
       System.out.println(s.empty());//false

       //search(Object o) :: int => it will return offset not index
       System.out.println(s.search("Z"));//-1
       System.out.println(s.search("A"));//2
    }
}