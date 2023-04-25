//Insert -> time complexity = 0(1)
//Search -> time complexity = 0(n)
// I problems it is not given , by which Data structure to solve the problem,
// we have to decide based on the problem
//Linked List ,mainly used for insertion
package com.company;
import java.util.*;

public class Linked_list
{
    public static void main(String[] args) {
        //Function(Methods are same as ArraysList but there are more here)
        LinkedList<Integer> l1  = new LinkedList<>();
        LinkedList<Integer> l2  = new LinkedList<>();

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(0,6);    //at zeroth index add 6
//        System.out.println(l1.size()|);  // o/p-> 5 is size of LinkedList

        //new in linked list
        l1.addFirst(345);
        l1.addLast(567);

       l1.push(888);    //will come at start
        l1.pop();           //will remove 888 LIFO(Last in first out)

        System.out.println(l1.peek());  //Returns head
        l1.poll();  //Retrieves and removes the head (first element) of this list.

        l1.remove(2);


        l1.toArray();   //return array of the list

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

//        l1.addAll(l2);  //here you can specify from which index you want to add l2

//        l1.clear();     //this will clear every element in arrayList

//        l1.ensureCapacity(3);   //set minmum capacity af arrayList

        System.out.println(l1.equals(l2));  //will print false because value in l1!=l2

//        System.out.println(l1.indexOf(3));

        System.out.println(l1.clone()); //a clone of this LinkedList instance[..]

        //Here for iterating through the loops to print all element in Linked list
        //use size instead of length
        for (int i =0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");  //Notice** not l1[i]..we use .get(i)
        }
    }
    }

