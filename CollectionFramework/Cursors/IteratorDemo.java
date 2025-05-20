/*
 * Iterator :: Universal Iterator which can work with all implementation classes of Collection interface
 * 
 * Methods :: 
 * hasNext()::boolean
 * next()   ::object
 * remove() :: 
 */

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for(int i=0;i<=10;i++){
            list.add(i);
        }
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Integer ele = (Integer) itr.next();
            if(ele == 2 ){
                itr.remove();
              //  list.add(2);//Exception in thread "main" java.util.ConcurrentModificationException
            }
        }
    }
}