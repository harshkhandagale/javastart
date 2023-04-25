// &&  ||  !
package com.company;

public class logical {
    public static void main(String[] args) {
        boolean a = true ;
        boolean b = false;
        System.out.println("Logical AND");
        if(a && b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No"); //just like truth table
        }

        boolean c = true ;
        boolean d = false;
        System.out.println("Logical Or");
        if(c || d){
            System.out.println("Yes");
        }
        else {
            System.out.println("No"); //just like truth table
        }

        System.out.println("Logical NOT");
        System.out.println(!a);
    }
}
