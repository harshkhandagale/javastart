package collections;
import java.util.Iterator;
import java.util.ArrayList;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add("harsh");
        a1.add("abc");
        a1.add(10);

        Iterator<Object> i = a1.iterator();
//        a1.add("haa"); // cannot do this or u you get concurrent modification error

//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());
//        System.out.println(i.next());
//        System.out.println(i.hasNext());

        while (i.hasNext()){
            System.out.println(i.next());
        }
        while (i.hasNext()){
            System.out.println(i.next()+" uu"); // this will not get executed sine
            // Ipterator iterate only once
        }

    }
}
