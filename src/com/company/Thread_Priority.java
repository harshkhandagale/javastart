//Thread priority  :--> according to the priorities the thread is executed
//Has 3 priorities
//1. Min Priority = 1
//1. Default Priority = 5
//1. Max Priority = 10

//* NOTE *
//But we cannot rely on the priorities beacuse our OS decides what is usefull and what not

package com.company;
class Th1 extends Thread{
    public Th1(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("I am priority thread :"+ this.getName());
        }
    }
}
public class Thread_Priority {
    public static void main(String[] args) {
        Th1 t1 = new Th1("harsh" + "has more priority :)");
        Th1 t2 = new Th1("kunal");
        Th1 t3 = new Th1("sham");
        Th1 t4 = new Th1("kevin");
        Th1 t5 = new Th1("simba");
        t1.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
