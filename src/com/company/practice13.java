package com.company;

class Th4 extends Thread{
    public void run(){
        int n=50;
        int i =0;
        while (i<n){
//            try {
//                Thread.sleep(20);       //sleep method not working properly For one class .. works when put in both the classes  ***
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Good morning");
            i++;
        }
    }
}

class Th5 extends Thread {
    public void run() {
        int n=50;
        int i =0;
        while (i<n) {
//            try {
//                Thread.sleep(20);       //sleep method not working properly   ***
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }

            System.out.println("Welcome");
            i++;
        }
    }
}

public class practice13 {
    public static void main(String[] args) {
        Th4 t1 = new Th4();
        Th5 t2 = new Th5();
//        t1.setPriority(Thread.MAX_PRIORITY);

        //Getting priority
        System.out.println("The priority of t2 object is : "+t2.getPriority());

        //getting state
        //before start() , the state is new
        System.out.println("the state of Thread Th4 is :" +t1.getState());
        System.out.println("the state of Thread Th5 is :" +t2.getState());
        t1.start();
        t2.start();
        //after start() , the state is runnablle
        System.out.println("the state of Thread Th5 is :" +t2.getState());
        //Refrence to the current thread
        System.out.println("refrence  :"+Thread.currentThread().getState());
    }

}

