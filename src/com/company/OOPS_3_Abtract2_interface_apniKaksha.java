//Interface is 2 part of abstraction, but it is pure, there must be no function in that class
// here implements keyword is used instead of extends
package com.company;
interface Animal1{
    int eye =2 ; //All the fields in interfaces are public, static and final by default...check notes
    public void walk();   //All methods are public & abstract by default.
}
interface Herbivour{

}
//Horse inherites Animal as well as Herbivour...Multiple inheritance
//NOTE*** multiple inheritance can be achived by interface and not a class  ***NOTE
class Horse1 implements Animal1,Herbivour{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

public class OOPS_3_Abtract2_interface_apniKaksha {
    public static void main(String[] args) {
        Horse1 h1 = new Horse1();
        h1.walk();
    }
}
