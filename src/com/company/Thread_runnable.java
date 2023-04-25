package com.company;
//using thread with runnable interface
class my_runnable1 implements Runnable{
    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("I am Runnnable 1 \n");
            i++;
        }
    }
}
class my_runnable2 implements Runnable{
    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("I am Runnable 2 \n");
            i++;
        }

    }
}
public class Thread_runnable {
    public static void main(String[] args) {
        //Remember this by concept of gun and bullet
        //i.e, you cannot fire unless until you load bullet in the gun
        //first crate bullet then load it in gun
        my_runnable1 bullet1 = new my_runnable1();
        Thread gun1 = new Thread(bullet1);          //loading bullet1 in gun1 ..Upcasting

        my_runnable2 bullet2 = new my_runnable2();
        Thread gun2 = new Thread(bullet2);          //loading bullet2 in gun2  :)

        gun1.start();
        gun2.start();


    }
}
