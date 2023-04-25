//Here we do not have get method in ArrayDeque
//*******NOTE**** here we cannot add element in between, only atFirst and atLast of the array
//Dequeue --> Double Ended Queue
package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
        ArrayDeque<Integer> l2 = new ArrayDeque<>();
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.addFirst(1);
        l1.addLast(10);
//        System.out.println(l1.size());  // o/p-> 5 is size of array

        l1.toArray();   //return array of the list

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

//        l1.addAll(l2);  //here you can specify from which index you want to add l2

//        l1.clear();     //this will clear every element in ArrayDequeue

//        l1.ensureCapacity(3);   //set minmum capacity af ArrayDequeue

        System.out.println(l1.equals(l2));  //will print false because value in l1!=l2

//        System.out.println(l1.indexOf(3));

        System.out.println(l1.clone()); //a clone of this ArrayDequeue instance


    }
    }

