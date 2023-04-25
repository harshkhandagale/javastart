//Same as HashSet only diff is that it contains (key, value) pair....
// instead of add it has put method to insert value and key
// Keys and values  must be unique
package com.company;
import java.util.HashMap;
import java.util.Map;

public class HashMap_ApniKaksha {
    public static void main(String[] args) {
//        (key, value) -> (country, population) ->(String, Integer)
        HashMap<String,Integer> map = new HashMap<>();

        //Insert-Add
        map.put("India",120);
        map.put("USA",30);
        map.put("China",180);

        //Print map
        System.out.println(map);

        //updating China
        map.put("China",200);
        System.out.println(map);

        //Search-contains
        if (map.containsKey("USA")){
            System.out.println("Present");
        }else {
            System.out.println("Not present");
        }

        //Get values at
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));   //returns null

        //Iteration through the Map (Like for each loop)
        for (Map.Entry<String,Integer> e : map.entrySet()){
//            System.out.println(e);  //Will print eveything in HashMap
            System.out.println(e.getKey());         //print only key
            System.out.println(e.getValue());       //print only value
        }



    }
}
