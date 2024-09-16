/*
continue : 
=> we can use continue statement to skip the current iteration and continue for
next iteration */

public class DemoContinue {

    public static void main(String[] args) {
        // eg#1.
        int x = 2;
        for (int i = 0; i < 10; i++) {
            if (i % x == 0)
                continue;
            System.out.println(i);
        }
        // Output : 1 3 5 7 9

        // eg#2. we can use continue only inside loops, if we try to use outside it
        // would result in "CompileTime Error".
        int x1 = 10;
        if (x1 == 10) {
            // continue;// continue cannot be used outside of a loop
        }
        System.out.println("hello");
        // do-while with continue
        int x2 = 0;
        do {
            x2 = x2 + 1;
            System.out.println(x2);
            if ((x2 = x2 + 1) < 5)
                continue;
            x2 = x2 + 1;
            System.out.println(x2);
        } while (++x2 < 10);
        // output : 1 4 8 10

        // Note: Compiler won't check for unreachablity in case of "if-else" statement,
        // whereas it checks for unreachability in case of loops.
        // eg#1.
        /*while (true)
            //System.out.println("hello");
        //System.out.println("hiee");// CE: unreachable statement
        // eg#2.
        if (true)
            //System.out.println("hello");// hello
        //else
           // System.out.println("hiee");
        */
    }
}