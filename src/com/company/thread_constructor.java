package com.company;

class MyThr extends  Thread{
    public MyThr(String name){
        super(name);             //because Thread class already has name, so inheriting it...here we will not write this.name
    }
    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("I am Thread");
        }
    }
}

public class thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harsh");
        System.out.println("ID of t1 is : "+t1.getId());
        System.out.println("Name is : "+t1.getName());
        //getId() and getname are inbuilt for Thread Constructor
    }
}
