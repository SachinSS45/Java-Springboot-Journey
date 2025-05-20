import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        ListIterator<String> itr = list.listIterator();

        while (itr.hasNext()) {
            System.out.println("prevIndex: " + itr.previousIndex());//-1
            System.out.println("nextIndex: " + itr.nextIndex());//0
            System.out.println("Element: " + itr.next());//A
        }
        System.out.println();
        /*
         *  prevIndex: -1
            nextIndex:  0
            Element:    A
            prevIndex:  0
            nextIndex:  1
            Element:    B
            prevIndex:  1
            nextIndex:  2
            Element:    C
         */
        while (itr.hasPrevious()) {
            System.out.println("prevIndex: " + itr.previousIndex());
            System.out.println("nextIndex: " + itr.nextIndex());
            System.out.println("Element: " + itr.previous());
        }
    }
}
