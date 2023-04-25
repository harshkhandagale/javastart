//Methods are put in try catch blocks
package com.company;
class Th2 extends Thread{
    public Th2(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while (true){
            System.out.println("Representing join method :"+this.getName());
        }
    }
}
class Th3 extends Thread{

    public void run(){
        int i =0;
        while (true){
            System.out.println("Slept for 4 seconds");
            try {
                Thread.sleep(4000);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
public class thread_Methods {
    public static void main(String[] args) {
        Th2 t1 = new Th2("Harsh");
        Th3 t2 = new Th3();
        t1.start();
//        try {
//            t1.join();  //will execute t1 and then t2 here, and not parallely ... we put this in try catch block because it can give interruption error
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}
