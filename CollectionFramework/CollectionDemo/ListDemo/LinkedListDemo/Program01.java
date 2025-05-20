import java.util.LinkedList;

public class Program01 {
    public static void main(String[] args) {
        //Underlying DataStructure :: doubly linked list
        LinkedList ll = new LinkedList();
        ll.add("Sachin");
        ll.add(30);
        ll.add(2,"Hero");
        System.out.println(ll);//[Sachin, 30, Hero, shetkar]

        //to add at first : addFirst(Object o)::void
        ll.addFirst("Mr.");
        //to set at particular index 
        ll.set(2,"Surayakant");
        System.out.println(ll);//[Mr., Sachin, Surayakant, Hero, shetkar]

    }
}