//Refer jdk 18 docs for other all methods of arraylist
//ArrayList is used over java because arrays are fixed, and ArrayList can Expand.
//Mainly used for searching problems
package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {
        //ArrayList is a Class
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(0,6);    //at zeroth index add 6
//        System.out.println(l1.size());  // o/p-> 5 is size of array

        l1.toArray();   //return array of the list

        //get element at particular index
        System.out.println("get element at 0th position : "+l1.get(0));;

        //set element
        l1.set(1,888);

        //remove
        l1.remove(1);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

//        l1.addAll(l2);  //here you can specify from which index you want to add l2

//        l1.clear();     //this will clear every element in arrayList

//        l1.ensureCapacity(3);   //set minmum capacity af arrayList

        System.out.println("Equal or not : "+l1.equals(l2));  //will print false because value in l1!=l2

//        System.out.println(l1.indexOf(3));

        System.out.println("Cloning : "+l1.clone()); //a clone of this ArrayList instance[...]

        //Here for iterating through the loops to print all element in array list
        //use size instead of length
        for (int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");  //Notice** not l1[i]..we use .get(i)

        }
        System.out.println("\n");
        //sorting
        Collections.sort(l1);
        System.out.println("Sorted : "+l1);

    }
}
