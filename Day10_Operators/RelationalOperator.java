/*
RelationalOperator in Java
++++++++++++++++++++++++++
 <,<=,>,>=
=> We can apply relational operators only on primtive types except "boolean types".
=> we cannot apply relational operators only reference types(on objects)
=> Nesting of relational operator is not possible in java.
 */
public class RelationalOperator {

    public static void main(String[] args) {
        // eg#1.
        System.out.println(10 > 10.5);// false
        System.out.println('a' > 10.5);// true
        System.out.println('z' > 'a');// true
        // System.out.println(true>false);//CE
        // System.out.println("sachin">"kohli");//CE
        // System.out.println(10<20<30);//CE
        // System.out.println(10>20>30);//CE

    }
}