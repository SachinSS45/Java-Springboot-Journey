package LinkedHashSetDemo;
import java.util.LinkedHashSet;
public class Program01 {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("A");
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("A");
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);
    }
}
