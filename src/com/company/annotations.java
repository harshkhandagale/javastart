package com.company;

//1. @Override
class NewPhone extends Smartphone{
    @Override
    void ring(){
        System.out.println("ringing");
    }
    @Deprecated         //Not to be used in the programm but we can supress it
    void vibrate1(){
        System.out.println("Vibrating");
    }
}

//2.@SuppressWarnings
@SuppressWarnings("deprecation")    //Warnings ko dabana

@FunctionalInterface        //not work if there are more than one method in an interface
interface NewInteface {
    void myRule();
//    void  myManners();    //Only one method allowed
}
public class annotations {
//    @SuppressWarnings("deprication")
    public static void main(String[] args){

        NewPhone ph1 = new NewPhone();
        ph1.ring();
        ph1.vibrate1();     //cannot do
    }
}
