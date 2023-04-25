package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(4);
        a1.add(5);
        a1.add(1);
        a1.add(2);
        ListIterator l1 = a1.listIterator();
//        System.out.println(l1.next());
//        System.out.println(l1.hasPrevious());
//        System.out.println(l1.hasNext());
//        while (l1.hasNext()){
//            int num = (int)l1.next();
//            if (num%2==0){
//                l1.remove(); // removing even numbers
//            }
//        }
        System.out.println(a1);

   //below will not get printed beacuse Iterator does not execute more than once
//        while (l1.hasNext()){
//            System.out.println("uuuuu");
//        }

        //Sorting by Collection class
        Collections.sort(a1);
        System.out.println(a1);

        //Reversing the elements
        ListIterator l2 = a1.listIterator(a1.size());
        while (l2.hasPrevious()){
            System.out.println(l2.previous());
        }
    }
}
