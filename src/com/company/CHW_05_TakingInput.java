package com.company;
import java.util.Scanner;

public class CHW_05_TakingInput {
    public static void main(String[] args){
        //just write sout for System.out.println()
        System.out.println("Taking import from the user");
        //read notes while doing this, here sc it an Object created, System.in is to take input from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        //this is method of the object
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is ");
        System.out.println(sum);


        System.out.println("enter floating number");
        System.out.println("enter num1");
        float a1 = sc.nextFloat();
        System.out.println("enter num2");
        float b1 = sc.nextFloat();
        float fsum = a1+b1;
        System.out.println("the total is");
        System.out.println(fsum);

        System.out.println("enter string");
//      String str = sc.next();    takes only one word and no word after a spacebar
        String str = sc.nextLine();
        System.out.println(str);




    }
}
