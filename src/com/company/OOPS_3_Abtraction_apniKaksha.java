//Read notes
//Abstraction means hidding unusefull data from the user and showing only the usefull data to the user
//instead of writing public class Animal ...we can write abstract class Anmal, beacuse in real we are using just the horse and the chicken class and Animal cloass is just a concept here
package com.company;
abstract class Animal{
    abstract void walk();
    //Constructor
    Animal (){
        System.out.println("Creating Animal");
    }
}
class Horse extends Animal{
    //creating contructor Horse
    Horse (){
        System.out.println("Created horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
    public void run(){
        System.out.println("Running");
    }
}
public class OOPS_3_Abtraction_apniKaksha {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
//        Animal a1 = new Animal();  //this will give an error because Animal is a abstract class , it is just a blue print or a concept we are using
//        a1.walk();                 // gives runtime error
        Horse h2 = new Horse();     //this will first call the animal class constructor and then the horse() contructor
        Chicken c1 = new Chicken();
        c1.run();

    }
}
