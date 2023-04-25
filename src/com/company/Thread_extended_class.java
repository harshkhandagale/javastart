//Using threads , the functions run parallely....previously one function would run then the other.
package com.company;

//using thread by extended class
class myThread1 extends Thread{
        public void run(){      //this is a method that is overridden from class thread
            int i =0;
            while (i<40000){
                System.out.println("I am thread 1 \n");
                i++;
            }
        }
}
class myThread2 extends Thread{
    public void run(){  //this is a method that is overridden from class thread
        int i = 0;
        while(i<40000){
            System.out.println("I am thread 2 \n");
            i++;
        }
    }
}

public class Thread_extended_class {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();


    }
}
