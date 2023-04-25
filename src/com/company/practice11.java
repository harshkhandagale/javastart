package com.company;

import org.w3c.dom.ls.LSOutput;

abstract class Pen1{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen1{
    void write(){
        System.out.println("writing");
    }

    @Override   //if there is any problem, by this ovverride we will come to know that the problem is in overriding
    void refill() {
        System.out.println("refilling");
    }

    void changeNib(){
        System.out.println("changing Nib");
    }
}


interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){

    }
    public void bite(){

    }
}
class Human extends Monkey implements BasicAnimal{
        public void eat(){
            System.out.println("eating");
        }
        public void sleep(){
            System.out.println("sleeping");
        }
}

abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}
class Smartphone{
    void ring(){
        System.out.println("ringing");
    };
}

//while inheriting a class from a interface we use implements and while inheriting a interface form a interface we use extends
interface TvRemote{
    void changeChannel();
}
interface SmartTvRemote extends TvRemote{
        void change();
}
class Tv implements TvRemote{
    public void changeChannel(){
        System.out.println("changing the channel");
    }

}

public class practice11 {
    public static void main(String[] args) {
        Monkey m1 = new Human();  //here we have created human with refrence to monkey , so we cannot call eat or sleep method, we can only use jump or bite method
        Smartphone s1 = new Smartphone();
        s1.ring();
    }
}
