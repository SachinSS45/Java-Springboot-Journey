package ArrayListDemo;

import java.util.ArrayList;

public class Program01{
    public static void main(String[] args) {
        //List : index plays a role[internally Array]
        ArrayList l = new ArrayList<>();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);//[A, 10, A, null]
        //1.size() : To find the size of ArrayList
        System.out.println(l.size());//4
        //2.remove(index) : To remove element by using index
        System.out.println(l.remove(0));//A
        //3. We can add element through index also add(index)::void
        l.add(1,"Sachin");//Will add Sachin at index 1 and remaining will be shifted forward
        l.add(null);
        System.out.println(l);//[10, Sachin, A, null, null]

    }
}