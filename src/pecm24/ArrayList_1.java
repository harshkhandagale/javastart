package pecm24;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("Harsh");
        a1.add(true);
//        System.out.println("a1");
//        System.out.println(a1);
        ArrayList  fruit= new ArrayList();
        fruit.add("mango");
        fruit.add("Guava");
        fruit.add("orange");
        fruit.add("apple");
        System.out.println("fruit");
        System.out.println(fruit);
//        System.out.println("List inside a list");
//        a1.add(fruit);
//        a1.add(2,false);
//        System.out.println(a1);
        //remove
//        fruit.remove(2); //remove element at index 2
//        fruit.removeAll(fruit);  //remove all fruits and returns empty list []
//        fruit.clear();              //remove all fruits and returns empty list []
        System.out.println(fruit.contains("mango"));  //true
        System.out.println(fruit.contains("Mango"));  //false...case sensitive
        System.out.println(fruit.indexOf("apple"));     //3
        System.out.println(fruit.indexOf("pineapple"));    //-1..i.e not in the list
        System.out.println(fruit.isEmpty());
        Object[] arr = fruit.toArray();
        System.out.println(fruit);

    }
}
