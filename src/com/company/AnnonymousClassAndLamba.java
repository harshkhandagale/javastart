package com.company;

interface Demo{
    void meth1(int a);
//    void meth2();
}

/*
//No need of this child class if you want only one expression to print, this increases the code so you should use annonymous class
class Annonymous implements Demo{
    @Override
    public void meth1(){
        System.out.println("I am Method 1");
    }

    @Override
    public void meth2() {
        System.out.println("I am Method 2");
    }
}
 */

public class AnnonymousClassAndLamba {
    public static void main(String[] args) {
//        Demo d1 = new Demo() {
//            @Override
//            public void meth1() {
//                System.out.println("I am Annonymous class method 1");
//            }
//            @Override
//            public void meth2() {
//                System.out.println("I am Annonymous class method 2");            }
//        };
//        d1.meth1();



        //You can also use Lambda Expression ()->{ } i.e
        Demo d2 = (a)->{ System.out.println("I am method 1 of Lambda : "+a); };
        d2.meth1(7);

    }
}

