//Strings are immutable i.e cannot be changed
//String is a separate class given by java
package com.company;

import java.util.Scanner;

public class chw_13_string {
    public static void main(String[] args) {
//      String name = new String("Harsh");
//        String name = "Harsh";
//        System.out.print("My name is : ");
//        System.out.print(name);

/*        int a = 6;
        float b = 5;
        String c= "Harsh";
        System.out.printf("value of a is %d and value of b is %f", a,b); //For more refer notes
        System.out.printf("value of c is %S",c);
        System.out.format("value of c is %S",c);


 */
        Scanner sc = new Scanner(System.in);  //Object
        System.out.println("Enter a String");
        String st = sc.nextLine();            //Method
        System.out.println(st);


    }
}
