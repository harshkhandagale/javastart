//HashSet --> unique values
// aapki hash table kitni full kii ja sakti hai, to increase the hash capacity
//full hone baaad capacity of hash ko badhaoo

package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_ApniKaksha {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Insert-Add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //size
        System.out.println("Size of the hashset is : "+set.size());

        //print set
        System.out.println(set);

        //Search-contains
        if (set.contains(1)){
            System.out.println("Set conatains 1");
        }
        if (!set.contains(6)){
            System.out.println("set does not contain 6");
        }

        //Delete-Remove
        set.remove(2);
        if (!set.contains(2)){
            System.out.println("We deleted 2");
        }
        System.out.println(set);

        set.add(2);
        System.out.println(set);

        //Iterating through the set / traversing
        Iterator it = set.iterator();

        //Iterator has two functions -> it.next, it.hasNext     //see notes
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
