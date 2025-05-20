import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        //add(object)::boolean :: used to object in linkedlist
        for(int i=0;i<=10;i++){
            ll.add(i);
        }
        //Printing complete list at a time
        System.out.println(ll.toString());//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //Creating ListItreator
        ListIterator litr = ll.listIterator();
        while(litr.hasNext()){
            //performing read operation
            Integer num = (Integer)(litr.next());
            if(num==3){
                //perform remove operation
                litr.remove();
            }
            if(num==4){
                //performing update operation
                litr.set(12);
            }
            if(num==5){
                litr.add(5);
            }
        }
        System.out.println(ll);


    }
}
