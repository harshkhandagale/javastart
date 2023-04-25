package com.company;
//**********************************  THREADS  *************************************
/*
class MyRunnablePrac implements Runnable {
    @Override               //Mandatory
    public void run() {
        while (1 < 3) {
            System.out.println("Runnable  1  running");

        }
    }
}
class MyRunnablePrac2 implements Runnable{
    @Override               //Mandatory
    public void run() {
        while (1<2) {
            System.out.println("Runnable  2  running");
        }
    }
}
 */

/*
class MyThreadPrac extends Thread{
    public void run(){
        int i =0;
        while (i<5){
            System.out.println("I am thread 1");
        }
    }
}
class MyThreadPrac2 extends Thread{
    MyThreadPrac2(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while (i<5){
            System.out.println("I am thread 2");
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

//******************************  EXCEPTIONS  **************************************
/*
class MyFuckingExceptions extends Exception{
    @Override
    public String getMessage(){
        return "Maximum Tries Exceeeded";
    }
}
*/
//***********************  ANONYMOUS AND LAMBDA  ************************************
/*
interface Demo1{
     void method1();
}
class Anyoyn implements Demo1{
    @Override
    public void method1(){
        System.out.println("I am level 1");
    }
}
 */

public class weekend3 {
    public static void main(String[] args) throws FileNotFoundException {
/*        ****************************  THREAD  ***********************************
        @SuppressWarnings("deprecated")
        MyThreadPrac t1 = new MyThreadPrac();
        MyThreadPrac2 t2 = new MyThreadPrac2("Harsh");

        //Get priority and getId can be used only when the programm it not running , if it is start it will not show
        System.out.println("Id of t1 is : "+t1.getId());
        System.out.println("Priority of t1 is : "+t1.getPriority());
//        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority os t2  : "+t2.getPriority());
        System.out.println("Name of t2  is : "+t2.getName());
        System.out.println("Default name of t1  is : "+t1.getName());
        System.out.println(t1.getState());
        //getting refrence
        System.out.println("refrence  : "+Thread.currentThread().getState());

        t1.start();
        t2.start();
 */

/*
        MyRunnablePrac r1 = new MyRunnablePrac();
        MyRunnablePrac2 r2  = new MyRunnablePrac2();

        Thread myGun = new Thread(r1);
        Thread myGun2 = new Thread(r2);

        myGun.start();
        myGun2.start();

        myGun.getState();
 */

//******************************  EXCEPTIONS  **************************************
/*
        int [] arr = {12,13,14,15,16};
        int i =0;
        while (i<5){
            try {
                System.out.println("Enter index");
                Scanner sc = new Scanner(System.in);
                int idx = sc.nextInt();
                System.out.println("Value at this index is :" + arr[idx]);
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i>=5){
            try {
                throw new MyFuckingExceptions();
            }catch (Exception e){
                System.out.println(e);
            }

        }
 */
//******************************  ARRAY LIST  ****************************************
/*
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(20);
        l1.add(19);
        l1.add(14);

        l2.add(15);
        l2.add(16);
        l2.add(17);

        System.out.println(l1.size());
        System.out.println(l2.size());

        l1.addAll(l2);

        System.out.println("Size after adding l2 : "+l1.size());

        for (int i =0 ; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();

        l1.remove(3);
        System.out.println("After removing element at index 3 , the array size is : "+l1.size());
        Collections.sort(l1);
        System.out.println("Sorted array  :" + l1);

//        l1.clear();
//        System.out.println(l1.size());
 */


//******************************  LINKED LIST  ****************************************
/*
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(11);
        l1.add(12);
        l1.push(13);        //this will be at the top
        l1.add(14);
        for (int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println("Head is "+l1.peek());
        l1.poll();
        System.out.println("head removed by poll()");
        System.out.println("New List ");
        for (int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
        System.out.println("adding 453 at atlast ");
        l1.addLast(453);
        for (int i = 0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
 */
//******************************  ARRAY DEQUEUE  ****************************************
                       //SAME FUNCTIONS AS LINKED LIST AND ARRAYLIST



//******************************  HASH SET  ****************************************
                        //Only Unique values allowed
/*
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(14);

        System.out.println(set);
        System.out.println("size of Hashset after having dupli value: "+set.size());
        //Above will give you hashSet size as 3 , because duplicate value are not considerd

        if (set.contains(14)){
            System.out.println("14 yes present");
        }
        else {
            System.out.println("14 Not present");
        }

        set.remove(11);
        if (!set.contains(11)){
            System.out.println("successfully deleted 11 ");
        }
        System.out.println(set+"\n");
        System.out.println("Iterator");

        //******************IMP*******************
        //Iterating through the set / traversing
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
 */

//************************************  HASH MAP  ****************************************
/*
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"India");
        map.put(2,"USA");
        map.put(3,"Pakistan");

        System.out.println(map);

        System.out.println(map.containsKey(2));

        System.out.println(map.get(3));

        map.put(2,"Malyasia");
        System.out.println(map);
        System.out.println("\n");
        //Iterating in HashMap
        for (Map.Entry<Integer,String> e : map.entrySet()){
//            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e.hashCode());
        }
 */
//***********************  ANONYMOUS AND LAMBDA  ************************************
/*
        Anyoyn a1 = new Anyoyn(){
            @Override
            public void method1(){
                System.out.println("Leavel 2");
            }
        };
        a1.method1();

        Demo1 d2 = ()->{System.out.println("I am lamba");};
        d2.method1();
 */

//*************************************  FILE  ***********************************************
/*
        //creating a new file
        File myFIle1 = new File("myFile125");
        try{
            myFIle1.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }

        //wriring in file
        try {
            FileWriter myFileWriter = new FileWriter("myFile125");
            myFileWriter.write("This is Harsh on September 2, didnt Wake up at 4 am as decide\nbut never see back keep grinding");
            myFileWriter.close();
        }
        catch (IOException e){
            System.out.println(e);
        }

        //Reading File
        File myFile = new File("myFile125");
        try{
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("File not Found");
        }

        //Deleting
//        myFile.delete();
 */



    }
}
