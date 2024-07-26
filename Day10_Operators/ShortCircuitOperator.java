/*
 ShortCircuit Operator
++++++++++++++++++++++
 &&, || : These operators are exactly same as "& and |",but with small differences.
 1)&,|
    => Both the arguments should be evaluated always
    => Performance is relatively slow.
    => It is applicable for both integral and boolean types.
 2)&&,||
    => Second argument evaluation is optional.
    => Performance is relatively high
    => It is applicable only for boolean types, not for integral types.
Note:
 x && y
    => y will be evaluated only if x is true,otherwise y won't be evaluated.
    => x is true, then y will be evaluated.
 x || y
    => y will be evaluated only if x is false, otherwise y won't be evaulated.
    => x is true, then y won't be evaulated.

 */
public class ShortCircuitOperator {

    public static void main(String[] args) {
        // eg#1.
        int x = 10, y = 15;
        if (++x < 10 || ++y > 15)
            x++;
        else
            y++;
        System.out.println("x = " + x);// 12
        System.out.println("y = " + y);// 16

    }
}