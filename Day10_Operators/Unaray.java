/*
 increment operator
 a. pre-increment[first increment and then use it]
        eg: int x = 10;
        int y = ++x; // x = 11, y = 11
 b. post-increment[first use it and then increment it]
        eg: int x = 10;
        int y = x++; // x= 11 , y = 10
 */
public class Unaray {

    public static void main(String[] args) {
        // Note: 1. increment or decrement can be applied only on variables, but not on values directly.

        //int y = 10++; // CE
        
        // 2. we can't perform nesting of increment or decrement operator, it would result in compile time error.
        int x = 10;
        //int y1 = ++(++x);// CE
        System.out.println("x = " + x);//10
       // System.out.println("y = " + y);
       
       // 3. For a final variable, increment or decrement operation can't be done.
        final int x2 = 4;
        //x2++;// CE
        System.out.println(x2);
        
        // 4. we can't apply increment or decrement operator on boolean type, where as
        // it can be applied on other primitive types.
        int x3 = 10;
        x3++;
        System.out.println(x3);// 11
        char ch = 'a';
        ch++;
        System.out.println(ch);// b
        double d = 10.5;
        d++;
        System.out.println(d);// 11.5
        boolean b = true;
        //b++;// CE
        System.out.println(b);//true
        
        // 5. What is the difference b/w b = b+1 and b++?
        byte b2 = 10;
        //b2= b2 + 1; // CE (byte+int :: int)
        System.out.println(b);
        byte b3 = 10;
        b3++; // b = (byte)(b+1);
        System.out.println(b);// 11
    }
}