package collections;
//refer ArrayList_2_practise in PECM24 package
import java.util.ArrayList;

public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("Harsh");
        a1.add(true);
        System.out.println(a1);
        ArrayList <String>fruit = new ArrayList();
        fruit.add("Guava");
        fruit.add("Pine");
        fruit.add("mango");
        a1.add(fruit);
        System.out.println(a1);
        System.out.println(a1.isEmpty());
        System.out.println(a1.indexOf("Apple"));
        System.out.println(a1.contains("jjj"));
        Object[]arr = a1.toArray();
        System.out.println(a1);
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
