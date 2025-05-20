/*
 * Cursors : 
 * 1)Enumeration : Legacy Cursor : We can apply on legacy classes : Vector , Stack , Hashtable
 *   methods : 
 *   hasMoreElements() :: boolean
 *   nextElement()     :: object
 *   Limations : Only work in forward direction , We can't do any update/add/remove operation.
 */

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector();

        for(int i=0;i<=10;i++){
            v.add(i);
        }

        System.out.println(v);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //Legacy Cursor 
        Enumeration e = v.elements();

        while(e.hasMoreElements()){

            Integer obj = (Integer)(e.nextElement());

            if(obj%2==0){
                System.out.println(obj);//0,2,4,6,8,10
                v.add(3);
                v.remove(3);
            }
        }
        
    }
}